package com.example.swozp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClub;
    private String clubName;



    public void findByClubName(String keyword){

    }
//    List<Club> findAll(String keyword){
//        return null;
//    }
//    List<Club> findAll() {
//        return null;
//    }
}
