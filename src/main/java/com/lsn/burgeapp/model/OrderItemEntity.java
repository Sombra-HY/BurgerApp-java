package com.lsn.burgeapp.model;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
public class OrderItemEntity {
    @ManyToOne
    @JoinColumn(name = "id_order")
    private OrderEntity id_order;

    private ItemEntity id_item;

    @Column(length = 256, nullable = false)
    private String order_note;
    @Column(length = 128, nullable = false)
    private Integer quantity;
    @Column(length = 8, nullable = false)
    private Double price;
}
