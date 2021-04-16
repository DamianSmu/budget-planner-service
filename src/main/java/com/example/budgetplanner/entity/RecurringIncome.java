package com.example.budgetplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class RecurringIncome {

    @Id
    private String id = UUID.randomUUID().toString();
}
