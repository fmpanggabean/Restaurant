package people;

import restaurant.*;

public class Visitor {
	private String visitName;
	private int expenses = 0 ;
	
	public Visitor(String visitName) {
		this.visitName = visitName;
	}
	public String getVisitName() {
		return visitName;
	}
	public void setVisitName(String visitName) {
		this.visitName = visitName;
	}
	
	public int getExpenses() {
		return expenses;
	}
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	public void addExpenses(int expenses) {
		this.expenses += expenses;
	}
	public void showTotalPrice() {
		System.out.println(this.getVisitName()+"'s Expenses : "+ Restaurant.formatIDR(this.expenses));
		
	}
}
