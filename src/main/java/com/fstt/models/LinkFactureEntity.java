package com.fstt.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = ("link_facture"))
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class LinkFactureEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 3L;

    @EmbeddedId
    private LinkFactureKey id;

    @ManyToOne()
    @MapsId("factureId")
    @JoinColumn(name = ("facture_id"))
    private FactureEntity facture;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = ("product_id"))
    private ProductEntity product;

    private double quantity;

}
