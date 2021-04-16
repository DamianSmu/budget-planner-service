package com.example.budgetplanner.repository;

import com.example.budgetplanner.entity.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, String> {
}
