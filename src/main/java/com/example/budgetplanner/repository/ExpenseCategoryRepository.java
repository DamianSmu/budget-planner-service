package com.example.budgetplanner.repository;

import com.example.budgetplanner.entity.ExpenseCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseCategoryRepository extends JpaRepository<ExpenseCategory, String> {
}
