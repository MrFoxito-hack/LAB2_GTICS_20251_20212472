package com.example.lab2_20212472.repositorio;

import com.example.lab2_20212472.modelo.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutoRepositorio extends JpaRepository<Auto, Integer> {
}
