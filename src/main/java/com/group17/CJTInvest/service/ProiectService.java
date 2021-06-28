package com.group17.CJTInvest.service;

import com.group17.CJTInvest.model.dto.ProiectDTO;

import javax.transaction.Transactional;
import java.util.List;

public interface ProiectService {

    @Transactional
    ProiectDTO save(ProiectDTO proiectDTO);

    @Transactional
    ProiectDTO update(ProiectDTO proiectDTO);

    void deleteProiect(long id);

    List<ProiectDTO> getProiecte();
}