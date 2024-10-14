package com.fstt.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name=("facture"))
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FactureEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private Integer ref;

    @Column(nullable = false, name = ("date_creation_facture"))
    private String date;

    @ManyToOne
    private ClientEntity client;

    @OneToMany(mappedBy = "facture", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<LinkFactureEntity> linkFactures;;
}
