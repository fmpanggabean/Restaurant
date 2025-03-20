package people;

import main.Main;

public class Visitor {
	private String name;
	private int totalSpent=0;
	
	public Visitor(String name) {
		this.name=name;
	}

	public String getName() {
		return name;
	}

	public int getTotalSpent() {
		return totalSpent;
	}

	public void addSpent(int price) {
		totalSpent+=price;
	}

	public void showTotalPrice() {
		System.out.println(name + " spent " + Main.formatIDR(totalSpent));
	}

}
