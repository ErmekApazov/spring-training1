package com.cydeo.entity.inheritance;

import com.cydeo.entity.inheritance.Account;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
public class CreditAccount extends Account {

    private BigDecimal creditLimit;

}
