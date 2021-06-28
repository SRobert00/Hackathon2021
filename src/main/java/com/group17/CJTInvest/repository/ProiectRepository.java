package com.group17.CJTInvest.repository;

import com.group17.CJTInvest.model.entity.Proiect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface ProiectRepository extends JpaRepository<Proiect, Long> {
    @Query(value = "SELECT * from Proiect", nativeQuery = true)
    List<Proiect> getProiecte();

    @Query(value = "SELECT * from Proiect where proiectId=:proiectId", nativeQuery = true)
    Proiect getProiectById(Long proiectId);
}