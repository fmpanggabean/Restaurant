package people;

import restaurant.*;

public class Visitor {
	private String name;
	private int totalSpend = 0;
	
	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSpend() {
		return totalSpend;
	}

	public void setTotalSpend(int totalSpend) {
		this.totalSpend += totalSpend;
	}

	public void showTotalPrice() {
		System.out.printf("%s ", this.name);
		System.out.printf("Total Spent: %s\n", Restaurant.formatIDR(totalSpend));
	}
	
	
}
