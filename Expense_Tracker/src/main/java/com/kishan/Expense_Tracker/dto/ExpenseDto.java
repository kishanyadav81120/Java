package com.kishan.Expense_Tracker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ExpenseDto
{
    private Long id;
    private String expenseName;
    private String expenseCategory;
    private BigDecimal expenseAmount;
}
