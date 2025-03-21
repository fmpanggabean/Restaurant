package people;

import helper.Format;

public class Visitor {
	private String name;
	private int totalSpent = 0;

	public Visitor(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println(name + "'s Total Spent: " + Format.formatIDR(totalSpent));
	}

	public void setSpent(int spent) {
		totalSpent += spent;
	}

	public String getName() {
		return name;
	}

}
