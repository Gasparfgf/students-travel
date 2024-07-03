package com.example.studentstravel.student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer> {


    List<StudentEntity> findAllByAddress(String address);

    List<StudentEntity> findAllByAge(int age);
}
