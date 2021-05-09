package com.example.budgetplanner.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class Account {
    @Id
    private String id = UUID.randomUUID().toString();

    @OneToMany
    private List<Budget> budgets;

    @OneToMany
    private List<Expense> expenses;

    @OneToMany
    private List<Income> incomes;

    private float balance = 0;
}
