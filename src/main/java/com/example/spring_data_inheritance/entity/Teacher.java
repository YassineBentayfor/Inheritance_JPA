package com.example.spring_data_inheritance.entity;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@DiscriminatorValue("Teacher")
public class Teacher extends Personne{

    @Enumerated(value = EnumType.STRING)
    private Department department;


    public Teacher(String firstName, String lastName, Department department) {
        super(firstName, lastName);
        this.department = department;
    }

    public Teacher() {
    }
}
