package com.example.budgetplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
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

    public Budget(Account account, float cashAmount, LocalDateTime startDate, LocalDateTime endDate, ExpenseCategory category) {
        this.account = account;
        this.cashAmount = cashAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.category = category;
    }

    public Budget() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public float getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(float cashAmount) {
        this.cashAmount = cashAmount;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public ExpenseCategory getCategory() {
        return category;
    }

    public void setCategory(ExpenseCategory category) {
        this.category = category;
    }
}
