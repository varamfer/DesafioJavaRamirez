package com.coderhouse.clientes.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table (name = "FACTURA")
public class FacturaEntity {

    @Id
    @Column(name = "idfactura")
    private Long idfactura;

    @Column(name = "FECHA")
    private Date fecha;
    @Column(name = "CANTIDAD")
    private Long cantidad;
    @Column(name = "TOTAL")
    private Float precio;

    @ManyToOne
    @JoinColumn(name="clienteid")
    private ClienteEntity cliente;

    //Getters and Setters

    public Long getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(Long idfactura) {
        this.idfactura = idfactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public ClienteEntity getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntity cliente) {
        this.cliente = cliente;
    }


    //To String del objeto

    @Override
    public String toString() {
        return "FacturaEntity{" +
                "idfactura=" + idfactura +
                ", fecha=" + fecha +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", cliente=" + cliente +
                '}';
    }


    //Constructor


    public FacturaEntity(Long idfactura, Date fecha, Long cantidad, Float precio, ClienteEntity cliente) {
        this.idfactura = idfactura;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.precio = precio;
        this.cliente = cliente;
    }

    //Constructor vacio
    public FacturaEntity() {}


    public Long getId() {
        return idfactura;
    }
}
