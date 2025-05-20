package com.example.crud_produtos.Services;

import com.example.crud_produtos.Entities.ProdutoEntity;
import com.example.crud_produtos.Exceptions.ProdutoException;
import com.example.crud_produtos.Repositories.ProdutoRepository;
import com.example.crud_produtos.Services.Abstractions.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService implements IProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Override
    public ProdutoEntity save(ProdutoEntity entity) {
        return produtoRepository.save(entity);
    }

    @Override
    public ProdutoEntity update(Long id, ProdutoEntity entity) throws ProdutoException {
        ProdutoEntity produto = produtoRepository.findById(id)
                .orElseThrow(() -> new ProdutoException("Produto não encontrado"));;

        return produtoRepository.save(entity);
    }

    @Override
    public void delete(Long id) {
        var produto = produtoRepository.findById(id).orElse(null);

        if( produto != null){
            produtoRepository.delete(produto);
        }
    }

    @Override
    public Optional<ProdutoEntity> findById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public List<ProdutoEntity> findAll() {
        return produtoRepository.findAll();
    }
}
