package com.rdeconti.controleponto.repository;

import com.rdeconti.controleponto.model.TipoData;
import com.rdeconti.controleponto.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDataRepository extends JpaRepository<TipoData, Long> {
}