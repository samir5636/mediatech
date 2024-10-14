package com.fstt.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = ("user_profile"))
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserProfile implements Serializable {

    @Id
    @GeneratedValue
    private Integer id;

    private String avatare;

    private String phone;

    @OneToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
}
