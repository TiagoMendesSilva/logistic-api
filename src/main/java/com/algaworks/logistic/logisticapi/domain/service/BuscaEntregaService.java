package com.algaworks.logistic.logisticapi.domain.service;

import com.algaworks.logistic.logisticapi.domain.exception.NegocioException;
import com.algaworks.logistic.logisticapi.domain.model.Entrega;
import com.algaworks.logistic.logisticapi.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

    private EntregaRepository entregaRepository;

    public Entrega buscar(Long entregaId){

        return entregaRepository.findById(entregaId)
                .orElseThrow( () -> new NegocioException("Entrega não encontrada"));
    }
}
