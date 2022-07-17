package com.coderhouse.clientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "PRODUCTO")
public class ProductoEntity {

    @Id
    @Column(name = "idproducto")
    private Long idproducto;

    @Column(name = "CODIGO")
    private Long codigo;

    @Column(name = "DETALLE")
    private String detalle;

    @Column(name = "CANTIDAD")
    private Long cantidad;

    @Column(name = "PRECIO")
    private Float precio;

    //Getters and Setters

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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


    //To String del objeto
    @Override
    public String toString() {
        return "ProdcutoEntity{" +
                "idproducto=" + idproducto +
                ", codigo=" + codigo +
                ", detalle='" + detalle + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                '}';
    }
    //Constructor

    public ProductoEntity(Long idproducto, Long codigo, String detalle, Long cantidad, Float precio) {
        this.idproducto = idproducto;
        this.codigo = codigo;
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    //Constructor vacio
    public ProductoEntity() {}


    public Long getId() {
        return idproducto;
    }
}
