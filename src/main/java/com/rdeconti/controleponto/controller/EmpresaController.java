package com.rdeconti.controleponto.controller;

import com.rdeconti.controleponto.model.Empresa;
import com.rdeconti.controleponto.model.JornadaTrabalho;
import com.rdeconti.controleponto.service.EmpresaService;
import com.rdeconti.controleponto.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/empresa")

public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping
    public Empresa createEmpresa(@RequestBody Empresa empresa) {
        return empresaService.saveEmpresa(empresa);
    }

    @GetMapping
    public List<Empresa> getEmpresaList() {
        return empresaService.findAll();
    }

    @GetMapping("/{idEmpresa}")
    public ResponseEntity<Empresa> getEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa) throws Exception{
        return ResponseEntity.ok(empresaService.getById(idEmpresa).orElseThrow(() -> new Exception("Empresa não encontrada.")));
    }

    @PutMapping
    public Empresa updateEmpresa(@RequestBody Empresa empresa) {
        return empresaService.updateEmpresa(empresa);
    }

    @DeleteMapping ("/{idEmpresa}")
    public ResponseEntity<Empresa> deleteEmpresaByID(@PathVariable("idEmpresa") Long idEmpresa) {
        try {
            empresaService.deleteEmpresa(idEmpresa);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return (ResponseEntity<Empresa>) ResponseEntity.ok();

    }

}
