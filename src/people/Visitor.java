package people;

import helper.Helper;

public class Visitor {
	private String name;
	private int totalSpent = 0;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addTotalSpent(int amount) {
		this.totalSpent += amount;
	}
	
	public void showTotalPrice() {
		System.out.printf("%s's Total Spent: %s\n", name, Helper.formatIDR(totalSpent));
	}
}
