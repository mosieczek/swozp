package com.example.swozp.service;

import com.example.swozp.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompetitionService extends JpaRepository<Competition, Long> {

//    @Query("SELECT c FROM Competition c WHERE c.competition_name LIKE %?1%")
//    public List<Competition> search (String keyword);
//
//    List<Competition> listAll(String keyword);
//
//    List<Competition> listAll();
}