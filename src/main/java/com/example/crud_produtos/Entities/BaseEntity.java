package com.example.crud_produtos.Entities;

import jakarta.persistence.*;



//Anotacao para mapear a superclasse
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long PkId;

    public BaseEntity(Long pkId) {
        PkId = pkId;
    }
    public BaseEntity() {}

    public Long getPkId() { return this.PkId; }
    public void setPkId(Long pkId) {}
}
