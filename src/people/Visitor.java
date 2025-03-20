package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private int expense;

	public int getExpense() {
		return expense;
	}

	public void setExpense(int expense) {
		this.expense = expense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Visitor(String name) {
		this.name = name;
	}
	
	public void addExpense(int price) {
		this.expense += price;
	}

	public void showTotalPrice() {
		System.out.println(this.name + "'s Total Expense: " + Restaurant.formatIDR(this.expense));
		System.out.println();
	}
}

