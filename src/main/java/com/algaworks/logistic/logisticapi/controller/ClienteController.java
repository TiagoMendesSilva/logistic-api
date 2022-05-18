package com.algaworks.logistic.logisticapi.controller;

import com.algaworks.logistic.logisticapi.domain.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){

        Cliente cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setEmail("joao@algaworks.com");
        cliente1.setTelefone("11 99999-1111");

        Cliente cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setEmail("maria@algaworks.com");
        cliente2.setTelefone("11 99999-2222");

        return Arrays.asList(cliente1,cliente2);
    }
}
