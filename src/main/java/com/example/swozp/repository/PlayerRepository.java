package com.example.swozp.repository;


import com.example.swozp.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long>{
//    List<Player> findByIdPlayer(String keyword);
}