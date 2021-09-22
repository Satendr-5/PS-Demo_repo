package com.sapient.budgetcalculator.rent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sapient.budgetcalculator.rent.model.BudgetCalculatorRent;

@Repository
public interface BudgetCalculatorRentRepository extends JpaRepository<BudgetCalculatorRent, Long> {

}
