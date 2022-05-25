package com.algaworks.logistic.logisticapi.domain.model.dto;

import com.algaworks.logistic.logisticapi.domain.model.Destinatario;
import com.algaworks.logistic.logisticapi.domain.model.StatusEntrega;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Getter
@Setter
public class EntregaModel {

    private Long id;
    private String nomeCliente;
    private BigDecimal taxa;
    private StatusEntrega status;
    private OffsetDateTime dataPedido;
    private OffsetDateTime dataFinalizacao;
    private DestinatarioModel destinatario;
}
