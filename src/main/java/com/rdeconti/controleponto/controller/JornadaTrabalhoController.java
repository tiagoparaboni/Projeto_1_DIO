package com.rdeconti.controleponto.controller;

import com.rdeconti.controleponto.model.JornadaTrabalho;
import com.rdeconti.controleponto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/jornada")

public class JornadaTrabalhoController {

    @Autowired
    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList() {
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception{
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() -> new Exception("Jornada não encontrada.")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping ("/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteJornadaByID(@PathVariable("idJornada") Long idJornada) {
        try {
            jornadaService.deleteJornada(idJornada);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();

    }

}
