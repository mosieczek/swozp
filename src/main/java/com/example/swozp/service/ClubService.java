package com.example.swozp.service;

import com.example.swozp.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ClubService extends JpaRepository<Club, Long> {

//   @Query("SELECT c FROM Club c WHERE c.clubName LIKE %?1%")
    public List<Club> findByClubName(String clubName);

//    List<Club> findAll(String keyword);

//    List<Club> findAll();
}