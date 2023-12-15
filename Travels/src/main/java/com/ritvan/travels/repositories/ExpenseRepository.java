package com.ritvan.travels.repositories;

import com.ritvan.travels.models.Expenses;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends CrudRepository<Expenses, Long> {
    List<Expenses> findAll();
}
