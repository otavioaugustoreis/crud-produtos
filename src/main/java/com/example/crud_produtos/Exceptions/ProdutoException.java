package com.example.crud_produtos.Exceptions;

public class ProdutoException extends Exception {


    private final String MENSAGEM_PADRAO = "Produto não foi encontrado";

    public ProdutoException(String message ) {
        super(message);
    }
}
