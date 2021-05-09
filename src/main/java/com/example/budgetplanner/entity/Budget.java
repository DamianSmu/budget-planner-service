package com.example.budgetplanner.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
public class Budget {

    @Id
    private String id = UUID.randomUUID().toString();

    @ManyToOne
    private Account account;

    private float cashAmount;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @ManyToOne
    private ExpenseCategory category;
}
