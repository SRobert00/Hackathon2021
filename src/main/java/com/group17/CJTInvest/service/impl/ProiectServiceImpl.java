package com.group17.CJTInvest.service.impl;

import com.group17.CJTInvest.model.dto.ProiectDTO;
import com.group17.CJTInvest.model.entity.Proiect;
import com.group17.CJTInvest.repository.ProiectRepository;
import com.group17.CJTInvest.service.ProiectService;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class ProiectServiceImpl implements ProiectService {

    private static final Logger logger = LoggerFactory.getLogger(ProiectServiceImpl.class);


    private final ProiectRepository proiectRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ProiectServiceImpl(ProiectRepository proiectRepository, ModelMapper modelMapper) {
        this.proiectRepository = proiectRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProiectDTO save(ProiectDTO proiectDTO) {
        Proiect proiect = modelMapper.map(proiectDTO, Proiect.class);
        proiectRepository.save(proiect);
        return proiectDTO;
    }

    @Override
    public ProiectDTO update(ProiectDTO proiectDTO) {
        Proiect proiectEntity = proiectRepository.getProiectById(proiectDTO.getProiectId());
        proiectEntity.setAlteSurse(proiectDTO.getAlteSurse());
        proiectEntity.setBugetCJT(proiectDTO.getBugetCJT());
        proiectEntity.setContributieCJT(proiectDTO.getContributieCJT());
        proiectEntity.setFonduriProiecteEU(proiectDTO.getFonduriProiecteEU());
        proiectEntity.setProbleme(proiectDTO.getProbleme());
        proiectEntity.setDirectia(proiectDTO.getDirectia());
        proiectEntity.setDataActualizare(proiectDTO.getDataActualizare());
        proiectEntity.setDenumireObiectiv(proiectDTO.getDenumireObiectiv());
        proiectEntity.setPersoanaResponsabila(proiectDTO.getPersoanaResponsabila());
        proiectEntity.setStatusDescriere(proiectDTO.getStatusDescriere());
        proiectEntity.setTrimestru(proiectDTO.getTrimestru());
        proiectEntity.setTotal(proiectDTO.getTotal());

        proiectRepository.save(proiectEntity);
        logger.info("Proiect actualizat!");

        return modelMapper.map(proiectEntity, ProiectDTO.class);
    }

    @Override
    public void deleteProiect(long id) {
        proiectRepository.deleteById(id);
    }

    @Override
    public List<ProiectDTO> getProiecte() {
        List<Proiect> proiectEntityList = proiectRepository.getProiecte();

        return proiectEntityList
                .stream()
                .map(proiectEntity -> modelMapper.map(proiectEntity, ProiectDTO.class))
                .collect(Collectors.toList());
    }
}