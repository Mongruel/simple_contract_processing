package model.entities;

import java.time.LocalDate;

public class Installment {
	private LocalDate dueDate;
	private LocalDate amount;
	
	public Installment() {
	}

	public Installment(LocalDate dueDate, LocalDate amount) {
		super();
		this.dueDate = dueDate;
		this.amount = amount;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public LocalDate getAmount() {
		return amount;
	}

	public void setAmount(LocalDate amount) {
		this.amount = amount;
	}
	
}
