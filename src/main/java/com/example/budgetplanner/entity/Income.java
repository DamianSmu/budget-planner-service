package com.example.budgetplanner.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class Income {

    @Id
    private String id = UUID.randomUUID().toString();

    @ManyToOne
    private Account account;

    private float cashAmount;

    private LocalDateTime dateTime;

    @ManyToOne
    private IncomeCategory category;

    public Income(Account account, float cashAmount, LocalDateTime dateTime, IncomeCategory category) {
        this.account = account;
        this.cashAmount = cashAmount;
        this.dateTime = dateTime;
        this.category = category;
    }

    public Income() {
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public IncomeCategory getCategory() {
        return category;
    }

    public void setCategory(IncomeCategory category) {
        this.category = category;
    }
}
