package com.example.damcuoichihuong.service;

import com.example.damcuoichihuong.entity.Expense;
import com.example.damcuoichihuong.entity.Gift;
import com.example.damcuoichihuong.entity.Menu;
import com.example.damcuoichihuong.repository.GiftRepo;
import com.example.damcuoichihuong.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    @Autowired
    private MenuRepo menuRepo;
    @Autowired
    private GiftRepo giftRepo;

    public Expense getTotal(Integer numberGuest) {
        Expense expense = new Expense();
        int totalTable = numberGuest/6 + 1;
        expense.setTotalExpense(totalTable * menuRepo.totalPrice());
        expense.setTotalBonus(giftRepo.totalPrice());
        System.out.println(expense);
        return expense;
    }
}
