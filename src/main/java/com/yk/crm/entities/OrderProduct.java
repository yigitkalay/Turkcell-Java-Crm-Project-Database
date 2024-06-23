package com.yk.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orderProduct")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="quantity")
    private int quantity;

    @ManyToOne()
    @JoinColumn(name = "order_id")
    private Order order;

    @Column(name = "product_id",nullable = false)
    private Integer product_id;

}
