package com.sparta.week02_hw.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Person extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = true)
    private String address;

    @Column(nullable = false)
    private String job;

    public Person(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
        this.job = requestDto.getJob();
    }

    public Person(String name, int age,
                  String address, String job){
        this.name = name;
        this.age = age;
        this.address = address;
        this.job = job;
    }

    public void update(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.address = requestDto.getAddress();
        this.job = requestDto.getJob();
    }


}
