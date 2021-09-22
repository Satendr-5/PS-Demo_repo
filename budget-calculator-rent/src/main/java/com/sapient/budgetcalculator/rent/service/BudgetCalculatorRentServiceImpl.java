package com.sapient.budgetcalculator.rent.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sapient.budgetcalculator.rent.model.BudgetCalculatorRent;
import com.sapient.budgetcalculator.rent.repository.BudgetCalculatorRentRepository;

@Service
public class BudgetCalculatorRentServiceImpl implements BudgetCalculatorRentService {

	@Autowired
	private BudgetCalculatorRentRepository repository;

	public Optional<BudgetCalculatorRent> findById(Long id) {
		return repository.findById(id);
	}

}