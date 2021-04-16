package com.example.budgetplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
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

    public Account(List<Budget> budgets, List<Expense> expenses, List<Income> incomes) {
        this.budgets = budgets;
        this.expenses = expenses;
        this.incomes = incomes;
    }

    public Account() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Budget> getBudgets() {
        return budgets;
    }

    public void setBudgets(List<Budget> budgets) {
        this.budgets = budgets;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
