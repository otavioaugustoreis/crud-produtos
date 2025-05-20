package com.example.crud_produtos.Services.Abstractions;

import com.example.crud_produtos.Exceptions.ProdutoException;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
    T save(T entity);
    T update(Long id, T entity) throws ProdutoException;
    void delete(Long id);
    Optional<T> findById(Long id);
    List<T> findAll();
}
