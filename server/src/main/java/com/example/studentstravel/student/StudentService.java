package com.example.studentstravel.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentService {
    private StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<StudentEntity> getAllStudents(){
        return studentRepository.findAll();
    }

    public List<StudentEntity> getStudentsByAddress(String address){
        return studentRepository.findAllByAddress(address);
    }
    public List<StudentEntity> getStudentsByAge(int age){
        return studentRepository.findAllByAge(age);
    }

    public Optional<StudentEntity> getStudent(int id){
        return studentRepository.findById(id);
    }

    public double getAverageAge() {
        return studentRepository.findAll().stream()
                .mapToInt(StudentEntity::getAge)
                .average()
                .orElse(0);
    }

    public double getAverageCommuteTime() {
        return studentRepository.findAll().stream()
                .mapToDouble(StudentEntity::getTravelTime)
                .average()
                .orElse(0.0);
    }
}
