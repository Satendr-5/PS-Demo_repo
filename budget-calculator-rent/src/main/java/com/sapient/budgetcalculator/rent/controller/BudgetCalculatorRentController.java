package com.sapient.budgetcalculator.rent.controller;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.budgetcalculator.rent.model.BudgetCalculatorRent;
import com.sapient.budgetcalculator.rent.service.BudgetCalculatorRentServiceImpl;

@RestController
@RequestMapping("/budget-calculator")
public class BudgetCalculatorRentController {

	@Autowired
	private BudgetCalculatorRentServiceImpl service;

	Logger LOGGER = LoggerFactory.getLogger(BudgetCalculatorRentController.class);

	@GetMapping(value = "/rent/id/{id}")
	public BudgetCalculatorRent retrievRentValue(@PathVariable Long id) {
		Optional<BudgetCalculatorRent> rentValue = service.findById(id);
		if (!rentValue.isPresent()) {
			throw new EntityNotFoundException("id-" + id);
		}
		return rentValue.get();
	}

}