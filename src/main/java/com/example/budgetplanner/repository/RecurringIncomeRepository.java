package com.example.budgetplanner.repository;

import com.example.budgetplanner.entity.RecurringIncome;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecurringIncomeRepository extends JpaRepository<RecurringIncome, String> {
}
