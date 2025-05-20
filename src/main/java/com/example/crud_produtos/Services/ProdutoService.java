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

        produto.setDsNome(entity.getDsNome());
        produto.setNrPreco(entity.getNrPreco());
        produto.setNrQuantidade(entity.getNrQuantidade());

        return produtoRepository.save(produto);
    }

    @Override
    public void delete(Long id) throws ProdutoException {

        ProdutoEntity produto = produtoRepository.findById(id)
                .orElseThrow(() ->  new ProdutoException("Produto não encontrado"));

        produtoRepository.delete(produto);
    }

    @Override
    public ProdutoEntity findById(Long id) throws ProdutoException {
        return produtoRepository.findById(id)
                .orElseThrow(() ->  new ProdutoException("Produto não encontrado"));
    }

    @Override
    public List<ProdutoEntity> findAll() {
        return produtoRepository.findAll();
    }
}
