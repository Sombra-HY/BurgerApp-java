package com.lsn.burgeapp.model;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAddress;

    @ManyToOne
    @JoinColumn(name ="id_user")
    private UserEntity id_user;

    private Long idUser;
    @Column(length = 32)
    private String nickname;
    @Column(length = 128, nullable = false)
    private String street;
    @Column(length = 128, nullable = false)
    private String city;
    @Column(length = 128, nullable = false)
    private String state;
    @Column(length = 8, nullable = false)
    private String postal_Code;
}
