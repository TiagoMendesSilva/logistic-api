package com.algaworks.logistic.logisticapi.domain.service;

import com.algaworks.logistic.logisticapi.domain.exception.NegocioException;
import com.algaworks.logistic.logisticapi.domain.model.Cliente;
import com.algaworks.logistic.logisticapi.domain.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@AllArgsConstructor
@Service
public class CatalogoClienteService {

    private ClienteRepository clienteRepository;

    @Transactional
    public Cliente salvar(Cliente cliente){

        boolean emailEmUso = clienteRepository.findByEmail(cliente.getEmail())
                .stream()
                .anyMatch(clienteExistente -> !clienteExistente.equals(cliente));

        if(emailEmUso){
            throw new NegocioException("Já existe cliente cadastrado com esse e-mail");
        }

        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long id){

        clienteRepository.deleteById(id);
    }

    public Cliente buscar(Long clientId){
        return clienteRepository.findById(clientId)
                .orElseThrow(() -> new NegocioException("Cliente não encontrado."));
    }


}
