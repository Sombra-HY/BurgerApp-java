package com.lsn.burgeapp.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id_user;
    @Column(length = 64, nullable = false)
    private String password;
    @Column(length = 64, nullable = false, unique = true)
    private String email;
    @Column(length = 32, nullable = false)
    private String first_name;
    @Column(length = 128, nullable = false)
    private String last_name;
    @Column(length = 15, unique = true)
    private Long number;
}
