package com.rdeconti.controleponto.repository;

import com.rdeconti.controleponto.model.JornadaTrabalho;
import com.rdeconti.controleponto.model.NivelAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NivelAcessoRepository extends JpaRepository<NivelAcesso, Long> {
}