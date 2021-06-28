package com.group17.CJTInvest.service;

import com.group17.CJTInvest.model.dto.ProiectDTO;
import com.group17.CJTInvest.model.dto.UtilizatorDTO;

import javax.transaction.Transactional;
import java.util.List;

public interface UtilizatorService {

    List<UtilizatorDTO> getUsers();

    @Transactional
    UtilizatorDTO save(UtilizatorDTO utilizatorDTO);
}