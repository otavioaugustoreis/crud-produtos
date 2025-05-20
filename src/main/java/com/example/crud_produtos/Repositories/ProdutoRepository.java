package com.example.crud_produtos.Repositories;

import com.example.crud_produtos.Entities.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity, Long> {
}
