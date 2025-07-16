package com.kishan.Expense_Tracker.controller;


import com.kishan.Expense_Tracker.dto.ExpenseDto;
import com.kishan.Expense_Tracker.service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expense")
@RequiredArgsConstructor
public class ExpenseController
{

    private final ExpenseService expenseService;

//    @PostMapping
//    public ResponseEntity<String> addExpense(@RequestBody ExpenseDto expenseDto)
//    {
//        Long expenseId = expenseService.addExpense(expenseDto);
//        return ResponseEntity.ok("Expense is created with id:"+expenseId);
//    }

//    @PutMapping
//    public void updateExpense(@RequestBody ExpenseDto expenseDto)
//    {
//        expenseService.updateExpense(expenseDto);
//
//    }

//    @GetMapping
//    public List<ExpenseDto> getAllExpense()
//    {
//        return expenseService.getAllExpense();
//
//    }
//    @GetMapping("/{id}")
//    public ExpenseDto getExpense(Long id)
//    {
//        return expenseService.getExpense(id);
//    }
//    @DeleteMapping("/{id}")
//    public String deleteExpense(Long id)
//    {
//        expenseService.deleteExpense(id);
//        return"success";
//    }

//    @PostMapping
//    public ResponseEntity<String> addExpense(@RequestBody  ExpenseDto expenseDto)
//    {
//        Long expenseId = expenseService.addExpense(expenseDto);
//        return ResponseEntity.ok("Expense id:"+expenseId);
//    }
//
//    @GetMapping()
//    public List<ExpenseDto> getAllExpense()
//    {
//        return expenseService.getAllExpense();
//    }
//
//    @GetMapping("/{id}")
//    public ExpenseDto findID(@PathVariable Long id)
//    {
//        return expenseService.getExpense(id);
//    }
//    @DeleteMapping("/{id}")
//    public String deleteExpense(@PathVariable long id)
//    {
//        expenseService.deleteExpense(id);
//        return "deleted successfully";
//    }
//
//    @PutMapping
//    public void updateExpense(@RequestBody ExpenseDto expenseDto)
//    {
//        expenseService.updateExpense(expenseDto);
//    }


 @PostMapping
    public ResponseEntity<String> addExpense(@RequestBody ExpenseDto expenseDto)
 {
     Long l = expenseService.addExpense(expenseDto);
     return ResponseEntity.ok("Expense id"+l);
 }

    @GetMapping
    public List<ExpenseDto> getAllExpense()
    {
        return expenseService.getAllExpense();
    }
    @PutMapping
    public void updateExpense(@RequestBody ExpenseDto expenseDto)
    {
        expenseService.updateExpense(expenseDto);
    }
    @GetMapping("{/id}")
    public ExpenseDto getExpense(@PathVariable Long id)
    {
        return expenseService.getExpense(id);
    }

    @DeleteMapping("{/id}")
    public  String deleteExpense(@PathVariable Long id)
    {
        expenseService.deleteExpense(id);
        return "Deleted Successfully";
    }

}
