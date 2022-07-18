package com.coderhouse.clientes.service;

import com.coderhouse.clientes.dao.FacturaRepository;
import com.coderhouse.clientes.dao.ProductoRepository;
import com.coderhouse.clientes.entity.FacturaEntity;
import com.coderhouse.clientes.entity.ProductoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImplementation implements FacturaService{

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public FacturaEntity buscarPorId(Long idfactura) {
        return facturaRepository.findById(idfactura).orElse(null);
    }
    @Override
    public List<FacturaEntity> buscarTodos() {
        return facturaRepository.findAll();
    }

    @Override
    public FacturaEntity crearFactura(FacturaEntity factura) throws Exception {
        if (buscarPorId(factura.getId()) == null) {
            return facturaRepository.save(factura);
        }
        else {
            throw new Exception( "Factura ya existe");
        }
    }

    @Override
    public FacturaEntity actualizarFactura(FacturaEntity factura) throws Exception {
        if (buscarPorId(factura.getId()) != null) {
            return facturaRepository.save(factura);
        } else {
            throw new Exception( "Factura no existe" );
        }

    }



}
