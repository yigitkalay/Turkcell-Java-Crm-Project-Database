package com.yk.crm.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "account_number")
    private String accountNumber;
    @Column(name = "account_status")
    private String accountStatus;
    @Column(name = "account_name")
    private String accountName;
    @Column(name = "account_type")
    private String accountType;

    @ManyToOne()
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
