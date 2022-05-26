package com.algaworks.logistic.logisticapi.domain.service;

import com.algaworks.logistic.logisticapi.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@AllArgsConstructor
@Service
public class FinalizacaoEntregaService {


    private EntregaRepository entregaRepository;
    private BuscaEntregaService buscaEntregaService;

    @Transactional
    public void finalizar(Long entregaId) {

       var entrega = buscaEntregaService.buscar(entregaId);
       entrega.finalizar();
       entregaRepository.save(entrega);
    }
}
