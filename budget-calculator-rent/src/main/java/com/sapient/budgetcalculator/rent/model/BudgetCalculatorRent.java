package com.sapient.budgetcalculator.rent.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BudgetCalculatorRent {

	@Id
	private Long id;
	@Column(name = "rent")
	private BigDecimal rent;

	public BudgetCalculatorRent() {

	}

	public BudgetCalculatorRent(Long id, BigDecimal rent) {
		super();
		this.id = id;
		this.rent = rent;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getRent() {
		return rent;
	}

	public void setRent(BigDecimal rent) {
		this.rent = rent;
	}

}
