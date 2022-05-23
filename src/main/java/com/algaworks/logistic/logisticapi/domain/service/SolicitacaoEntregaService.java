package com.algaworks.logistic.logisticapi.domain.service;

import com.algaworks.logistic.logisticapi.domain.exception.NegocioException;
import com.algaworks.logistic.logisticapi.domain.model.Cliente;
import com.algaworks.logistic.logisticapi.domain.model.Entrega;
import com.algaworks.logistic.logisticapi.domain.model.StatusEntrega;
import com.algaworks.logistic.logisticapi.domain.repository.ClienteRepository;
import com.algaworks.logistic.logisticapi.domain.repository.EntregaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@AllArgsConstructor
@Service
public class SolicitacaoEntregaService {

    private ClienteRepository clienteRepository;
    private EntregaRepository entregaRepository;

    @Transactional
    public Entrega solicitar(Entrega entrega){

        Cliente cliente = clienteRepository.findById(entrega.getCliente().getId())
                .orElseThrow(() -> new NegocioException("Cliente não encontrado"));

        entrega.setCliente(cliente);
        entrega.setStatus(StatusEntrega.PENDENTE);
        entrega.setData_do_pedido(LocalDateTime.now());

        return entregaRepository.save(entrega);
    }
}
