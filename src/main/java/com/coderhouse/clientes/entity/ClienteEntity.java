package com.coderhouse.clientes.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table (name = "CLIENTE")
public class ClienteEntity {

    @Id
    @Column(name = "idcliente")
    private Long idcliente;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "APELLIDO")
    private String apellido;

    @Column(name = "DOCUMENTO")
    private Long documento;

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Long getDocumento() {
        return documento;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public long getId() {
        return idcliente;
    }

    public void setId(long idcliente) {
        this.idcliente = idcliente;
    }

    //To String del objeto
    @Override
    public String toString() {
        return "ClienteEntity{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", documento=" + documento +
                ", idcliente=" + idcliente +
                '}';
    }

    //Constructor
    public ClienteEntity(String nombre, String apellido, Long documento, Long idcliente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.idcliente = idcliente;
    }

    //Constructor vacio
    public ClienteEntity() {}



}
