package com.example.crud_produtos.Models;


import org.antlr.v4.runtime.misc.NotNull;



public class ProdutoDTO {
    @NotNull
    private String DsNome;
    @NotNull
        private Integer NrQuantidade;
    @NotNull
    private Double NrPreco;
}
