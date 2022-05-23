package com.algaworks.logistic.logisticapi.domain.service;

import com.algaworks.logistic.logisticapi.domain.model.Entrega;
import com.algaworks.logistic.logisticapi.domain.model.StatusEntrega;
import com.algaworks.logistic.logisticapi.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {

    private EntregaRepository entregaRepository;

    @Transactional
    public Entrega solicitar(Entrega entrega){

        entrega.setStatus(StatusEntrega.PENDENTE);
        entrega.setData_do_pedido(LocalDateTime.now());

        return entregaRepository.save(entrega);
    }
}
