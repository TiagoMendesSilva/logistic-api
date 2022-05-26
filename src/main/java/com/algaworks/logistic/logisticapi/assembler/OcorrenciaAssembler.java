package com.algaworks.logistic.logisticapi.assembler;

import com.algaworks.logistic.logisticapi.domain.model.Ocorrencia;
import com.algaworks.logistic.logisticapi.domain.model.dto.OcorrenciaModel;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class OcorrenciaAssembler {

    private ModelMapper modelMapper;

    public OcorrenciaModel toModel(Ocorrencia ocorrencia){
        return modelMapper.map(ocorrencia,OcorrenciaModel.class);
    }
}
