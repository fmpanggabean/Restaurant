package people;

import helper.Formatter;

public class Visitor {

	private String name;
	private int totalSpend = 0;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addTotalSpend(int amount, int price) {
		totalSpend += (amount * price);
	}

	public void showTotalPrice() {
		System.out.println("======================================================");
		System.out.println(name + "'s total expense : " + Formatter.formatIDR(totalSpend));
		System.out.println("======================================================");
	}

}
