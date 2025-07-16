package com.kishan.Expense_Tracker.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="expense")
public class Expense
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String expenseName;
    private String expenseCategory;
    private BigDecimal expenseAmount;

}
