package com.rdeconti.controleponto.controller;

import com.rdeconti.controleponto.model.BancoHoras;
import com.rdeconti.controleponto.model.Movimentacao;
import com.rdeconti.controleponto.service.BancoHorasService;
import com.rdeconti.controleponto.service.MovimentacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bancohoras")

public class BancoHorasController {

    @Autowired
    BancoHorasService bancoHorasService;

    @PostMapping
    public BancoHoras createBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.sabeBancoHoras(bancoHoras);
    }

    @GetMapping
    public List<BancoHoras> getBancoHorasList() {
        return bancoHorasService.findAll();
    }

    @GetMapping("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> getBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras) throws Exception{
        return ResponseEntity.ok(bancoHorasService.getById(idBancoHoras).orElseThrow(() -> new Exception("Banco de Horas não encontrado.")));
    }

    @PutMapping
    public BancoHoras updateBancoHoras(@RequestBody BancoHoras bancoHoras) {
        return bancoHorasService.updateBancoHoras(bancoHoras);
    }

    @DeleteMapping ("/{idBancoHoras}")
    public ResponseEntity<BancoHoras> deleteBancoHorasByID(@PathVariable("idBancoHoras") Long idBancoHoras) {
        try {
            bancoHorasService.deleteBancoHoras(idBancoHoras);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<BancoHoras>) ResponseEntity.ok();

    }

}
