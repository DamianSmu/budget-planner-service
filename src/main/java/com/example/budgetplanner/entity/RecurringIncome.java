package com.example.budgetplanner.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class RecurringIncome {

    @Id
    private String id = UUID.randomUUID().toString();
}
