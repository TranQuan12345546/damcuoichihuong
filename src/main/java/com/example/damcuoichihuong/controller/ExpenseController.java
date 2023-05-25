package com.example.damcuoichihuong.controller;

import com.example.damcuoichihuong.entity.Expense;
import com.example.damcuoichihuong.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/expense")
public class ExpenseController {

    @Autowired
    private ExpenseService expense;

    @GetMapping("")
    public ResponseEntity<?> expense(@RequestParam Integer numberGuest) {
        Expense result = expense.getTotal(numberGuest);
        return ResponseEntity.ok(result);
    }
}
