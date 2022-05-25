package com.algaworks.logistic.logisticapi.api.controller;


import com.algaworks.logistic.logisticapi.assembler.EntregaAssembler;
import com.algaworks.logistic.logisticapi.domain.model.Entrega;
import com.algaworks.logistic.logisticapi.domain.model.dto.DestinatarioModel;
import com.algaworks.logistic.logisticapi.domain.model.dto.EntregaModel;
import com.algaworks.logistic.logisticapi.domain.repository.EntregaRepository;
import com.algaworks.logistic.logisticapi.domain.service.SolicitacaoEntregaService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas")
public class EntregaController {

    private EntregaAssembler entregaAssembler;
    private EntregaRepository entregaRepository;
    private SolicitacaoEntregaService solicitacaoEntregaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EntregaModel solicitar (@Valid @RequestBody Entrega entrega){

        return entregaAssembler.toModel(solicitacaoEntregaService.solicitar(entrega));
    }

    @GetMapping
    public List<EntregaModel> listar(){

        return entregaAssembler.toCollectModel(entregaRepository.findAll());
    }

    @GetMapping("/{entregaId}")
    public ResponseEntity<EntregaModel> buscar(@PathVariable Long entregaId){

        return entregaRepository.findById(entregaId)
                .map( entrega ->
                    ResponseEntity.ok(entregaAssembler.toModel(entrega)))
                        .orElse(ResponseEntity.notFound().build());
    }
}
