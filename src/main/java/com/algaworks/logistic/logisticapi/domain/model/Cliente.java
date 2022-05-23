package com.algaworks.logistic.logisticapi.domain.model;

import com.algaworks.logistic.logisticapi.domain.ValidationGroups;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class Cliente {

    @NotNull(groups = ValidationGroups.ClientId.class)
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 60)
    @Column
    private String nome;

    @NotBlank
    @Size(max = 255)
    @Email
    @Column
    private String email;

    @NotBlank
    @Size(min = 13 , max = 60)
    @Column(name="fone")
    private String telefone;

}
