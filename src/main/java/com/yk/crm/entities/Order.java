package com.yk.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name= "total_amount")
    private double total_amount;
    @Column(name= "service_start_date")
    private LocalDate serviceStartDate;

    @ManyToOne()
    @JoinColumn(name = "serviceAddress_id")
    private ServiceAddress serviceAddress;

    @OneToMany(mappedBy = "order")
    private List<OrderProduct> orderProduct;



}
