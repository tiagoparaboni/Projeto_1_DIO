package com.rdeconti.controleponto.repository;

import com.rdeconti.controleponto.model.Empresa;
import com.rdeconti.controleponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}