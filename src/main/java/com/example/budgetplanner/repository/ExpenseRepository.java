package com.example.budgetplanner.repository;

import com.example.budgetplanner.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, String> {
}
