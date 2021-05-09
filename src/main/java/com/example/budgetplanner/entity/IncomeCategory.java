package com.example.budgetplanner.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
@Data
public class IncomeCategory {

    @Id
    private String id = UUID.randomUUID().toString();

    @OneToMany
    private List<Income> incomes;

    private String category;
}
