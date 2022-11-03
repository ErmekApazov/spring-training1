package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "merchants")
@Data
@NoArgsConstructor
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String code;
    private BigDecimal transactionFee;
    private BigDecimal commissionRate;
    private Integer payoutDelayCount;

//    @OneToMany
//    private Payment payment; // Payment is looking for relationship and how to define multiple payment of objects

//    @OneToMany // foreign key is gonna be created
    @OneToMany (mappedBy = "merchant") // its gonna stop creating foreign key inside merchant table. // in OneToMany relationship, ownership belongs to many side;
    private List<Payment> paymentList; // I don't want to see payment information in Merchant table, but to see it in Payment Table.
    //OneToMany ==> One is Merchant, Many is Payment. One Merchant has Many payments

    public Merchant(String name, String code, BigDecimal transactionFee, BigDecimal commissionRate, Integer payoutDelayCount) {
        this.name = name;
        this.code = code;
        this.transactionFee = transactionFee;
        this.commissionRate = commissionRate;
        this.payoutDelayCount = payoutDelayCount;
    }


}
