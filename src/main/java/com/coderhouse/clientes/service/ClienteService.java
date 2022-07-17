package com.coderhouse.clientes.service;

import com.coderhouse.clientes.entity.ClienteEntity;

import java.util.List;

public interface ClienteService {
    List<ClienteEntity> buscarTodos();

    ClienteEntity buscarPorId(Long idcliente);

    ClienteEntity crearCliente (ClienteEntity cliente) throws Exception;

    ClienteEntity actualizarCliente(ClienteEntity cliente)  throws Exception;
}
