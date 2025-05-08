package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.guiengel.study_apir.model.Produto;

@Repository
public interface ProdutoRepository 
        extends JpaRepository<Produto, Long> {
}