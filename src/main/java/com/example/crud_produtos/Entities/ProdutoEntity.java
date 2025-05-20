package com.example.crud_produtos.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_PRODUTO")
public class ProdutoEntity extends  BaseEntity{

    private String DsNome;
    private Integer NrQuantidade;
    private Double NrPreco;
    public ProdutoEntity(Long pkId, String dsNome, Integer nrQuantidade, Double nrPreco) {
        super(pkId);

        DsNome = dsNome;
        NrQuantidade = nrQuantidade;
        NrPreco = nrPreco;
    }

    public ProdutoEntity() {

    }

    public String getDsNome() {
        return DsNome;
    }

    public void setDsNome(String dsNome) {
        DsNome = dsNome;
    }

    public Integer getNrQuantidade() {
        return NrQuantidade;
    }

    public void setNrQuantidade(Integer nrQuantidade) {
        NrQuantidade = nrQuantidade;
    }

    public Double getNrPreco() {
        return NrPreco;
    }

    public void setNrPreco(Double nrPreco) {
        NrPreco = nrPreco;
    }
}
