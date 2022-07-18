package com.coderhouse.clientes.controller;

import com.coderhouse.clientes.entity.FacturaEntity;
import com.coderhouse.clientes.entity.ProductoEntity;
import com.coderhouse.clientes.service.FacturaService;
import com.coderhouse.clientes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/facturas")

public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/all")
    public List<FacturaEntity> obtenerFacturas() {
        return facturaService.buscarTodos();
    }

    @GetMapping("/{id}")
    public FacturaEntity buscarFacturaPorId (@PathVariable Long idfactura) {
        return facturaService.buscarPorId(idfactura);
    }

    @PostMapping("/actualizar")
    public FacturaEntity actualizarFactura(@RequestBody FacturaEntity factura) throws Exception {
        return facturaService.actualizarFactura(factura);
    }

    @PostMapping("/crear")
    public FacturaEntity crearFactura(@RequestBody FacturaEntity factura) throws Exception {
        return facturaService.crearFactura(factura);
    }

}

