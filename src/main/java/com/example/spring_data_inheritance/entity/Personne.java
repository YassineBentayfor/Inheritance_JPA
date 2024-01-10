package com.example.spring_data_inheritance.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
        name = "person_type",
        discriminatorType = DiscriminatorType.STRING
)
public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String FirstName;
    private String LastName;



    public Personne(String firstName, String lastName) {
        FirstName = firstName;
        LastName = lastName;
    }
    public Personne() {
    }
}
