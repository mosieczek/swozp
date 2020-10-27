package com.example.swozp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.time.LocalDate;


@Entity
public class Player extends User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPlayer;

    private LocalDate medExDate;

    public void search(String keyword){}
}
