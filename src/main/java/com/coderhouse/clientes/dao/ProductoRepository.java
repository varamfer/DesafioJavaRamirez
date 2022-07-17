package com.coderhouse.clientes.dao;

import com.coderhouse.clientes.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <ProductoEntity, Long>{
}
