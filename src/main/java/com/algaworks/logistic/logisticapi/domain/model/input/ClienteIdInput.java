package com.algaworks.logistic.logisticapi.domain.model.input;

import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;


@NotNull
@Getter
@Setter
public class ClienteIdInput {

    @Valid
    @NotNull
    private Long id;
}
