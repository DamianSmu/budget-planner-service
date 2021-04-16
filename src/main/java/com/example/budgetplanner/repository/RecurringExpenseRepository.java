package com.example.budgetplanner.repository;

import com.example.budgetplanner.entity.RecurringExpense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecurringExpenseRepository extends JpaRepository<RecurringExpense, String> {
}
