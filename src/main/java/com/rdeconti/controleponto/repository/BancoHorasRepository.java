package com.rdeconti.controleponto.repository;

import com.rdeconti.controleponto.model.BancoHoras;
import com.rdeconti.controleponto.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BancoHorasRepository extends JpaRepository<BancoHoras, Long> {
}