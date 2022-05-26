package com.algaworks.logistic.logisticapi.domain.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Entrega {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     @ManyToOne
    private Cliente cliente;

    @Embedded
    private Destinatario destinatario;

    @Enumerated(EnumType.STRING)
    private StatusEntrega status;


    private BigDecimal taxa;


    private OffsetDateTime data_do_pedido;


    private OffsetDateTime data_pedido_finalizado;

    @OneToMany(mappedBy = "entrega",cascade = CascadeType.ALL)
    private List<Ocorrencia> ocorrencias = new ArrayList<>();

    public Ocorrencia adicionarOcorrencia(String descricao) {

        Ocorrencia ocorrencia = new Ocorrencia();
        ocorrencia.setDescricao(descricao);
        ocorrencia.setDataRegistro(OffsetDateTime.now());
        ocorrencia.setEntrega(this);

        this.getOcorrencias().add(ocorrencia);
        return ocorrencia;
    }
}
