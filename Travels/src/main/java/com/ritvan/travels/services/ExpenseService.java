package com.ritvan.travels.services;

import com.ritvan.travels.models.Expenses;
import com.ritvan.travels.repositories.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {
    @Autowired
    private ExpenseRepository expenseRepository;

    public List<Expenses>getAllExpenses(){
        return expenseRepository.findAll();
    }

    public void createExpense(Expenses expenses){
        expenseRepository.save(expenses);
    }

    public Expenses findExpense(Long id){
        Optional<Expenses>optionalExpense=expenseRepository.findById(id);
        if (optionalExpense.isPresent()){
            return optionalExpense.get();
        } else {
            return null;
        }
    }

    public Expenses updateExpense(Expenses expenses){
        return expenseRepository.save(expenses);
    }

    public void deleteExpense(Expenses expenses){
        expenseRepository.delete(expenses);
    }
}
