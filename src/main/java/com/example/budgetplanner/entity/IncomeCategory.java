package com.example.budgetplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class IncomeCategory {

    @Id
    private String id = UUID.randomUUID().toString();

    @OneToMany
    private List<Income> incomes;

    private String category;

    public IncomeCategory(List<Income> incomes, String category) {
        this.incomes = incomes;
        this.category = category;
    }

    public IncomeCategory() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
