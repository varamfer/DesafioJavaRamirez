package com.coderhouse.clientes.controller;

import com.coderhouse.clientes.entity.ProductoEntity;
import com.coderhouse.clientes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/productos")

public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/all")
    public List<ProductoEntity> obtenerProductos() {
        return productoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public ProductoEntity buscarProductoPorId (@PathVariable Long idproducto) {
        return productoService.buscarPorId(idproducto);
    }

    @PostMapping("/actualizar")
    public ProductoEntity actualizarProducto(@RequestBody ProductoEntity producto) throws Exception {
        return productoService.actualizarProducto(producto);
    }

    @PostMapping("/crear")
    public ProductoEntity crearProducto(@RequestBody ProductoEntity producto) throws Exception {
        return productoService.crearProducto(producto);
    }

}

