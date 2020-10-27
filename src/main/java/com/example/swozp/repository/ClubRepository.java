package com.example.swozp.repository;

import com.example.swozp.model.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClubRepository extends JpaRepository<Club, Long>{
//    List<Club> findByClubName(String keyword);

}