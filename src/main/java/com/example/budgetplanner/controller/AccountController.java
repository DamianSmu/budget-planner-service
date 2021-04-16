package com.example.budgetplanner.controller;

import com.example.budgetplanner.entity.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    public ResponseEntity<?> addAccount(@RequestBody Account account){
    }
}
