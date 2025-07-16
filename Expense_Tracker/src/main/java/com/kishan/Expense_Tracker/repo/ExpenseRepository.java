package com.kishan.Expense_Tracker.repo;

import com.kishan.Expense_Tracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
}
