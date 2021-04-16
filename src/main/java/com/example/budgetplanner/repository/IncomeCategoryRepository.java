package com.example.budgetplanner.repository;

import com.example.budgetplanner.entity.IncomeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeCategoryRepository extends JpaRepository<IncomeCategory, String> {
}
