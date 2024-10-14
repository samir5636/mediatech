package com.fstt.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = ("product"))
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id

    private Integer id;

    @Column(nullable = false)
    private String libelle;

    @Column(nullable = false)
    private String ref;

    @Column(nullable = false)
    private String prix;

    @Column(nullable = false)
    private double quantite_stock;

    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<LinkFactureEntity> linkFactures;
}
