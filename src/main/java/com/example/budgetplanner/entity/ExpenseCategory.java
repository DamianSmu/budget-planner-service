package com.example.budgetplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.UUID;

@Entity
public class ExpenseCategory {
    @Id
    private String id = UUID.randomUUID().toString();

    @OneToMany
    private List<Expense> expenses;

    private String categoryName;

    public ExpenseCategory(List<Expense> expenses, String categoryName) {
        this.expenses = expenses;
        this.categoryName = categoryName;
    }

    public ExpenseCategory() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
