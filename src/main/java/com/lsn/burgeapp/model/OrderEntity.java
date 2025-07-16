package com.lsn.burgeapp.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDateTime;

@Entity
@Getter
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_order;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private UserEntity id_user;

    @Column(length = 8, nullable = false)
    private Double total_price;
    @Column(length = 2, nullable = false)
    private Integer status;
    private LocalDateTime created_at;
}
