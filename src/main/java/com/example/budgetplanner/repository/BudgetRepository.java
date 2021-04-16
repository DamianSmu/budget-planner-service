package com.example.budgetplanner.repository;

import com.example.budgetplanner.entity.Budget;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BudgetRepository extends JpaRepository<Budget, String> {
}
