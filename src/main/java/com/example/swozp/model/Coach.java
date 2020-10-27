package com.example.swozp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Coach extends User{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoach;
    private Club idClub;


}
