package com.rdeconti.controleponto.controller;

import com.rdeconti.controleponto.model.Calendario;
import com.rdeconti.controleponto.model.Usuario;
import com.rdeconti.controleponto.service.CalendarioService;
import com.rdeconti.controleponto.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/calendario")

public class CalendarioController {

    @Autowired
    CalendarioService calendarioService;

    @PostMapping
    public Calendario createCalendario(@RequestBody Calendario calendario) {
        return calendarioService.saveCalendario(calendario);
    }

    @GetMapping
    public List<Calendario> getCalendarioList() {
        return calendarioService.findAll();
    }

    @GetMapping("/{idCalendario}")
    public ResponseEntity<Calendario> getCalendarioByID(@PathVariable("idCalendario") Long idCalendario) throws Exception{
        return ResponseEntity.ok(calendarioService.getById(idCalendario).orElseThrow(() -> new Exception("Calendário não encontrado.")));
    }

    @PutMapping
    public Calendario updateCalendario(@RequestBody Calendario calendario) {
        return calendarioService.updateCalendario(calendario);
    }

    @DeleteMapping ("/{idCalendario}")
    public ResponseEntity<Calendario> deleteCalendarioByID(@PathVariable("idCalendario") Long idCalendario) {
        try {
            calendarioService.deleteCalendario(idCalendario);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Calendario>) ResponseEntity.ok();

    }

}
