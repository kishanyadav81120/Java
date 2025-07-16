package com.kishan.Expense_Tracker.service;


import com.kishan.Expense_Tracker.dto.ExpenseDto;
import com.kishan.Expense_Tracker.entity.Expense;
import com.kishan.Expense_Tracker.repo.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService {
    private final ExpenseRepository expenseRepository;
//
//    public Long addExpense(ExpenseDto expenseDto)
//    {
//        Expense expense=mapFromDto(expenseDto);
//        return expenseRepository.save(expense).getId();
//    }
//
//
//
//    public void updateExpense(ExpenseDto expenseDto)
//    {
//        if(expenseDto.getId() == null)
//        {
//            throw new RuntimeException("expense id is required");
//        }
//        Expense savedExpense = expenseRepository.findById(expenseDto.getId())
//                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("can't find by id", expenseDto.getId())));
//        Expense expense=mapFromDto(expenseDto);
//
//        savedExpense.setExpenseName(expense.getExpenseName());
//        savedExpense.setExpenseCategory(expense.getExpenseCategory());
//        savedExpense.setExpenseAmount(expense.getExpenseAmount());
//        expenseRepository.save(savedExpense);
//
//
//    }
//
//
//
//
//    public ExpenseDto getExpense(Long id)
//    {
//       Expense expense= expenseRepository.findById(id).orElseThrow(()->new ExpenseNotFoundException(String.format("can't fin expense id'"+id)));
//
//       return  mapToDto(expense);
//    }
//
//
////
//
//
//
//    public List<ExpenseDto> getAllExpense()
//    {
//        return expenseRepository.findAll().stream().map(this::mapToDto).toList();
//
//    }
//
//
//
//
//
//    public void deleteExpense(Long id)
//    {
//        expenseRepository.deleteById(id);
//    }

//
//
//
//    private Expense mapFromDto(ExpenseDto expenseDto){
//        return Expense.builder()
//                .expenseName(expenseDto.getExpenseName())
//                .expenseCategory(expenseDto.getExpenseCategory())
//                .expenseAmount(expenseDto.getExpenseAmount())
//                .build();
//    }
//
//
//
//    private ExpenseDto mapToDto(Expense expense)
//    {
//        return ExpenseDto.builder()
//                .id(expense.getId())
//                .expenseName(expense.getExpenseName())
//                .expenseCategory(expense.getExpenseCategory())
//                .expenseAmount(expense.getExpenseAmount())
//                .build();
//    }
    /////////////////////////////////////////////////////////////////////////////

 public Expense mapFromDto(ExpenseDto expenseDto)
 {
     return Expense.builder()
             .expenseName(expenseDto.getExpenseName())
             .expenseCategory(expenseDto.getExpenseCategory())
             .expenseAmount(expenseDto.getExpenseAmount())
             .build();
 }

 public ExpenseDto mapToDto(Expense expense)
 {
     return ExpenseDto.builder()
             .id(expense.getId())
             .expenseName(expense.getExpenseName())
             .expenseAmount(expense.getExpenseAmount())
             .expenseCategory(expense.getExpenseCategory())
             .build();
 }



 public Long addExpense(ExpenseDto expenseDto)
 {
     Expense expense = mapFromDto(expenseDto);
     Expense save = expenseRepository.save(expense);
     return save.getId();
 }

 public void updateExpense(ExpenseDto expenseDto)
 {
     if(expenseDto.getId() != null)
     {
         throw new IllegalArgumentException("id is required" +expenseDto.getId());
     }
     Expense expense = mapFromDto(expenseDto);
     Expense savedExpense = expenseRepository.findById(expenseDto.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, String.format("expense id is required" + expenseDto.getId())));
    savedExpense.setExpenseName(expense.getExpenseName());
    savedExpense.setExpenseCategory(expense.getExpenseCategory());
    savedExpense.setExpenseAmount(expenseDto.getExpenseAmount());
    expenseRepository.save(savedExpense);

 }

 public List<ExpenseDto> getAllExpense()
 {
     return expenseRepository.findAll().stream().map(this::mapToDto).toList();
 }


 public ExpenseDto getExpense(Long id)
 {
     Expense expense = expenseRepository.findById(id).orElseThrow(() -> new ExpenseNotFoundException(String.format("expense id required" + id)));
    return mapToDto(expense);
 }

 public void deleteExpense(Long id)
 {
     expenseRepository.deleteById(id);
 }
}




