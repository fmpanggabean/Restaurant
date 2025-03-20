package people;

import restaurant.*;

public class Visitor {
	private String name;
	private int expense = 0;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	public Visitor(String name) {
		this.name = name;
	}
	
	public void addExpense(int expense) {
		this.expense += expense;
	}
	
	public void showTotalPrice() {
		System.out.printf("%s's Total Expenses: %s\n", this.name, Restaurant.formatIDR(this.getExpense()));
	}

}
