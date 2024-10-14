package com.fstt.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serial;
import java.io.Serializable;

@Embeddable
public class LinkFactureKey implements Serializable {

    @Serial
    private static final long serialVersionUID = 2L;

    @Column(name = ("facture_id"))
    private Integer factureId;

    @Column(name = ("product_id"))
    private String productId;
}
