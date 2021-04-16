package com.example.budgetplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class RecurringExpense {

    @Id
    private String id = UUID.randomUUID().toString();
}
