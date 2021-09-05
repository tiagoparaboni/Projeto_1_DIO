package com.rdeconti.controleponto.service;

import com.rdeconti.controleponto.model.TipoData;
import com.rdeconti.controleponto.model.Usuario;
import com.rdeconti.controleponto.repository.TipoDataRepository;
import com.rdeconti.controleponto.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipoDataService {

    TipoDataRepository tipoDataRepository;

    @Autowired
    public TipoDataService(TipoDataRepository tipoDataRepository) {
        this.tipoDataRepository = tipoDataRepository;
    }

    public TipoData saveTipoData(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public List<TipoData> findAll() {
        return tipoDataRepository.findAll();
    }

    public Optional<TipoData> getById(Long idTipoData) {
        return tipoDataRepository.findById(idTipoData);
    }

    public TipoData updateTipoData(TipoData tipoData) {
        return tipoDataRepository.save(tipoData);
    }

    public void deleteTipoData(Long idTipoData) {
        tipoDataRepository.deleteById(idTipoData);
    }
}
