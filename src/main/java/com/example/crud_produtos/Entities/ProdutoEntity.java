package com.example.crud_produtos.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_PRODUTO")
public class ProdutoEntity extends  BaseEntity{

    private String dsNome;
    private Integer nrQuantidade;
    private Double nrPreco;
    public ProdutoEntity(Long pkId, String dsNome, Integer nrQuantidade, Double nrPreco) {
        super(pkId);

        this.dsNome = dsNome;
        this.nrQuantidade = nrQuantidade;
        this.nrPreco = nrPreco;
    }

    public ProdutoEntity() {

    }

    public String getDsNome() {
        return dsNome;
    }

    public void setDsNome(String dsNome) {
        this.dsNome = dsNome;
    }

    public Integer getNrQuantidade() {
        return nrQuantidade;
    }

    public void setNrQuantidade(Integer nrQuantidade) {
        this.nrQuantidade = nrQuantidade;
    }

    public Double getNrPreco() {
        return nrPreco;
    }

    public void setNrPreco(Double nrPreco) {
        this.nrPreco = nrPreco;
    }
}
