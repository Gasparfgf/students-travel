package com.example.studentstravel.student;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "student")
@RequiredArgsConstructor
public class StudentEntity {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int age;
    private String travelWay;
    private String address;
    private double travelTime;
}
