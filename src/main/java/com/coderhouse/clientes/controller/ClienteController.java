package com.coderhouse.clientes.controller;

import com.coderhouse.clientes.entity.ClienteEntity;
import com.coderhouse.clientes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/clientes")

public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/all")
    public List<ClienteEntity> obtenerClientes() {
        return clienteService.buscarTodos();
    }

    @GetMapping("/{id}")
    public ClienteEntity buscarClientePorId (@PathVariable Long idcliente) {
        return clienteService.buscarPorId(idcliente);
    }

    @PostMapping("/actualizar")
    public ClienteEntity actualizarCliente(@RequestBody ClienteEntity cliente) throws Exception {
        return clienteService.actualizarCliente(cliente);
    }

    @PostMapping("/crear")
    public ClienteEntity crearCliente(@RequestBody ClienteEntity cliente) throws Exception {
        return clienteService.crearCliente(cliente);
    }

}

