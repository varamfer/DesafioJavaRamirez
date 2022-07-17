package com.coderhouse.clientes.service;

import com.coderhouse.clientes.entity.ProductoEntity;

import java.util.List;

public interface ProductoService {
    List<ProductoEntity> buscarTodos();

    ProductoEntity buscarPorId(Long idproducto);

    ProductoEntity crearProducto (ProductoEntity producto) throws Exception;

    ProductoEntity actualizarProducto (ProductoEntity producto)  throws Exception;
}
