package com.algaworks.logistic.logisticapi.assembler;

import com.algaworks.logistic.logisticapi.domain.model.Ocorrencia;
import com.algaworks.logistic.logisticapi.domain.model.dto.OcorrenciaModel;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Component
public class OcorrenciaAssembler {

    private ModelMapper modelMapper;

    public OcorrenciaModel toModel(Ocorrencia ocorrencia){
        return modelMapper.map(ocorrencia,OcorrenciaModel.class);
    }

    public List<OcorrenciaModel> toCollectModel(List<Ocorrencia> ocorrencias) {
        return ocorrencias.stream()
                .map(this::toModel)
                .collect(Collectors.toList());

    }
}
