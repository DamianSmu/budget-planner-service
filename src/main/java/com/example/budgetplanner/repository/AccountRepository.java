package com.example.budgetplanner.repository;


import com.example.budgetplanner.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, String> {
}
