package com.fstt.models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name= ("clients"))
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;
    private String telephone;

    @OneToMany(mappedBy = "client" , cascade = CascadeType.ALL , fetch = FetchType.LAZY)
    private List<FactureEntity> factures;
}
