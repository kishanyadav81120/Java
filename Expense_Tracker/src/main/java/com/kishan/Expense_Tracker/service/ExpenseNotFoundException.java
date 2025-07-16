package com.kishan.Expense_Tracker.service;

public class ExpenseNotFoundException extends RuntimeException
{
    public ExpenseNotFoundException(String message)
    {
        super(message);
    }
}
1