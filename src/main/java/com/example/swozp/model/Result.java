package com.example.swozp.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

public class Result {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_result;
}
