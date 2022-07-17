package com.coderhouse.clientes.service;

import com.coderhouse.clientes.dao.ClienteRepository;
import com.coderhouse.clientes.entity.ClienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImplementation implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public ClienteEntity buscarPorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
    @Override
    public List<ClienteEntity> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public ClienteEntity crearCliente(ClienteEntity cliente) throws Exception {
        if (buscarPorId(cliente.getId()) == null) {
            return clienteRepository.save(cliente);
        }
        else {
            throw new Exception( "Cliente ya existe");
        }
    }

    @Override
    public ClienteEntity actualizarCliente(ClienteEntity cliente) throws Exception {
        if (buscarPorId(cliente.getId()) != null) {
            return clienteRepository.save(cliente);
        } else {
            throw new Exception( "Cliente no existe" );
        }

    }



}
