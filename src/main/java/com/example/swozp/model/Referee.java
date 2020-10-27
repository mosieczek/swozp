package com.example.swozp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Referee {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_referee;
}
