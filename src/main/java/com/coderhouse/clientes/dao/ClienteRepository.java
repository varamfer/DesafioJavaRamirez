package com.coderhouse.clientes.dao;

import com.coderhouse.clientes.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository <ClienteEntity, Long>{
}
