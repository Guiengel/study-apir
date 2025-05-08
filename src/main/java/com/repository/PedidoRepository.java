package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.guiengel.study_apir.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{


}