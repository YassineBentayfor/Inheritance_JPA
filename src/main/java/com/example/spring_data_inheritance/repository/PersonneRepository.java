package com.example.spring_data_inheritance.repository;

import com.example.spring_data_inheritance.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonneRepository extends JpaRepository<Personne, Long> {

}
