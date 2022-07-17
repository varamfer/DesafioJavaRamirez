package com.coderhouse.clientes.service;

import com.coderhouse.clientes.dao.ProductoRepository;
import com.coderhouse.clientes.entity.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImplementation implements ProductoService{

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public ProductoEntity buscarPorId(Long idproducto) {
        return productoRepository.findById(idproducto).orElse(null);
    }
    @Override
    public List<ProductoEntity> buscarTodos() {
        return productoRepository.findAll();
    }

    @Override
    public ProductoEntity crearProducto(ProductoEntity producto) throws Exception {
        if (buscarPorId(producto.getId()) == null) {
            return productoRepository.save(producto);
        }
        else {
            throw new Exception( "Producto ya existe");
        }
    }

    @Override
    public ProductoEntity actualizarProducto(ProductoEntity producto) throws Exception {
        if (buscarPorId(producto.getId()) != null) {
            return productoRepository.save(producto);
        } else {
            throw new Exception( "Producto no existe" );
        }

    }



}
