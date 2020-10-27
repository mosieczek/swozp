package com.example.swozp.repository;

import com.example.swozp.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompetitionRepository extends JpaRepository<Competition, Long>{

//    List<Competition> findByCompetitonName(String keyword);
}