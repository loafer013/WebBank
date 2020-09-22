package com.example.demo.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter @Setter
public class Deposit {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long userId;
    private String data;
    private Long summa;
    private int day;

    public Deposit(Long id, Long userId, String data, Long summa, int day) {
        this.id = id;
        this.userId = userId;
        this.data = data;
        this.summa = summa;
        this.day = day;
    }

    public Deposit() {

    }
}
