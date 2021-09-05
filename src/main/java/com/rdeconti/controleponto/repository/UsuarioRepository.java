package com.rdeconti.controleponto.repository;

import com.rdeconti.controleponto.model.JornadaTrabalho;
import com.rdeconti.controleponto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}