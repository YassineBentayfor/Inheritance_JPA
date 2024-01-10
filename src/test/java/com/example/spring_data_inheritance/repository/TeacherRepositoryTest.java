package com.example.spring_data_inheritance.repository;

import com.example.spring_data_inheritance.entity.Department;
import com.example.spring_data_inheritance.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    TeacherRepository teacherRepository;
    @Test
    public void addTeacher(){
        Teacher teacher = new Teacher(
                "Kabbaj",
                "Anouar",
                Department.Informatique
        );
        teacherRepository.save(teacher);
    }
}