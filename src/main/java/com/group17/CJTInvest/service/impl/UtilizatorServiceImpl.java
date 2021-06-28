package com.group17.CJTInvest.service.impl;

import com.group17.CJTInvest.model.dto.UtilizatorDTO;
import com.group17.CJTInvest.model.entity.Utilizator;
import com.group17.CJTInvest.repository.UtilizatorRepository;
import com.group17.CJTInvest.service.UtilizatorService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


@Service
public class UtilizatorServiceImpl implements UtilizatorService {

    private static final Logger logger = LoggerFactory.getLogger(UtilizatorServiceImpl.class);

    private final ModelMapper modelMapper;
    private final UtilizatorRepository utilizatorRepository;

    @Autowired
    public UtilizatorServiceImpl(ModelMapper modelMapper, UtilizatorRepository utilizatorRepository) {
        this.modelMapper = modelMapper;
        this.utilizatorRepository = utilizatorRepository;
    }

    @Override
    public List<UtilizatorDTO> getUsers() {
        List<Utilizator> userEntityList = utilizatorRepository.getUtilizatori();

        return userEntityList
                .stream()
                .map(userEntity -> modelMapper.map(userEntity, UtilizatorDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public UtilizatorDTO save(UtilizatorDTO utilizatorDTO) {
        if (utilizatorDTO.getId() == null) {
            Random random = new Random();
            utilizatorDTO.setId(random.nextLong());
        }
        Utilizator utilizator = modelMapper.map(utilizatorDTO, Utilizator.class);
        utilizatorRepository.save(utilizator);
        logger.info("Utilizatorul " + utilizator.getNume() + " " + utilizator.getPrenume() + "a fost salvat cu succes.");

        return utilizatorDTO;
    }
}