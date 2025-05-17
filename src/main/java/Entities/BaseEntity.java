package Entities;

import jakarta.persistence.AssociationOverrides;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
