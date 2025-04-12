package com.example.lab2_20212472.repositorio;

import com.example.lab2_20212472.modelo.Seguro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeguroRepositorio extends JpaRepository<Seguro, Integer> {
}
