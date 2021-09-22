package com.sapient.budgetcalculatorrent.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Optional;

import com.sapient.budgetcalculator.rent.controller.BudgetCalculatorRentController;
import com.sapient.budgetcalculator.rent.model.BudgetCalculatorRent;
import com.sapient.budgetcalculator.rent.service.BudgetCalculatorRentServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class BudgetCalculatorRentControllerTest {

	@InjectMocks
	BudgetCalculatorRentController rentController;

	@Mock
	BudgetCalculatorRentServiceImpl rentServiceImpl;

	@Test
	public void retrievRentValueTest() throws Exception {
		Optional<BudgetCalculatorRent> optionalCheck = Optional.ofNullable(new BudgetCalculatorRent());
		optionalCheck.get().setId(1000L);
		optionalCheck.get().setRent(new BigDecimal(8000));

		when(rentServiceImpl.findById(optionalCheck.get().getId())).thenReturn(optionalCheck);

		BudgetCalculatorRent rent = rentController.retrievRentValue(optionalCheck.get().getId());
		assertEquals(new BigDecimal(8000), rent.getRent());
	}

}
