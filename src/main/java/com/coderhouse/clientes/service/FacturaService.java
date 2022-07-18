package com.coderhouse.clientes.service;

import com.coderhouse.clientes.entity.FacturaEntity;
import com.coderhouse.clientes.entity.ProductoEntity;

import java.util.List;

public interface FacturaService {
    List<FacturaEntity> buscarTodos();

    FacturaEntity buscarPorId(Long idfactura);

    FacturaEntity crearFactura (FacturaEntity factura) throws Exception;

    FacturaEntity actualizarFactura (FacturaEntity factura)  throws Exception;
}
