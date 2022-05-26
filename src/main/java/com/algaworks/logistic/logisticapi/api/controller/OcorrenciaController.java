package com.algaworks.logistic.logisticapi.api.controller;

import com.algaworks.logistic.logisticapi.assembler.OcorrenciaAssembler;
import com.algaworks.logistic.logisticapi.domain.model.Entrega;
import com.algaworks.logistic.logisticapi.domain.model.Ocorrencia;
import com.algaworks.logistic.logisticapi.domain.model.dto.OcorrenciaModel;
import com.algaworks.logistic.logisticapi.domain.model.input.OcorrenciaInput;
import com.algaworks.logistic.logisticapi.domain.service.BuscaEntregaService;
import com.algaworks.logistic.logisticapi.domain.service.RegistroOcorrenciaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/entregas/{entregaId}/ocorrencias")
public class OcorrenciaController {

    private RegistroOcorrenciaService registroOcorrenciaService;
    private OcorrenciaAssembler ocorrenciaAssembler;
    private BuscaEntregaService buscaEntregaService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public OcorrenciaModel registrar(@PathVariable Long entregaId, @Valid @RequestBody OcorrenciaInput ocorrenciaInput){

        Ocorrencia ocorrenciaRegistrada = registroOcorrenciaService.registrar(entregaId,ocorrenciaInput.getDescricao());

        return ocorrenciaAssembler.toModel(ocorrenciaRegistrada);
    }

    @GetMapping
    public List<OcorrenciaModel> listar (@PathVariable Long entregaId){

        Entrega entrega = buscaEntregaService.buscar(entregaId);
        return ocorrenciaAssembler.toCollectModel(entrega.getOcorrencias());
    }
}
