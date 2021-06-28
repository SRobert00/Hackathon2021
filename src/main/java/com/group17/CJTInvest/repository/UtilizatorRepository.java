package com.group17.CJTInvest.repository;

import com.group17.CJTInvest.model.entity.Utilizator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtilizatorRepository extends JpaRepository<Utilizator, Long> {

    @Query(value = "SELECT * from Utilizator", nativeQuery = true)
    List<Utilizator> getUtilizatori();
}