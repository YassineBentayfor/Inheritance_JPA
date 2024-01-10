package com.example.spring_data_inheritance.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("Student_ST")
public class Student extends Personne{
    private String emailAdress;

    public Student(String FirstName, String LastName, String emailAdress) {
        super(FirstName, LastName);
        this.emailAdress = emailAdress;
    }

    public Student(){
    }




}
