package com.example.spring_data_inheritance.repository;

import com.example.spring_data_inheritance.entity.Personne;
import com.example.spring_data_inheritance.entity.Student;
import com.example.spring_data_inheritance.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    StudentRepository studentRepository;
    @Test
    public void addStudent(){
        Student student = new Student(
                "Yassine",
                "Bentayfor",
                "yassine@gmail.com"
        );
        studentRepository.save(student);
    }

    @Test
    public void getAllPersons() {
        List<Personne> allPersons = studentRepository.findAll();
        for (Personne personne : allPersons) {
            System.out.println("Person ID: " + personne.getId());
            System.out.println("First Name: " + personne.getFirstName());
            System.out.println("Last Name: " + personne.getLastName());


            if (personne instanceof Student) {
                Student student = (Student) personne;
                System.out.println("Email Address: " + student.getEmailAdress());
            } else if (personne instanceof Teacher) {
                Teacher teacher = (Teacher) personne;
                System.out.println("Department: " + teacher.getDepartment());
            }

            System.out.println("---------------");
        }
    }

}