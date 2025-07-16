package com.lsn.burgeapp.model;

import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id_item;
    @Column(length = 64, nullable = false)
    private String item_name;
    @Column(length = 128, nullable = false)
    private String item_description;

}
