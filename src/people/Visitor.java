package people;

import main.Main;

public class Visitor {
	private String name;
	private int spending;

	public Visitor(String name) {
		this.name = name;
		this.spending = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpending() {
		return spending;
	}

	public void setSpending(int spending) {
		this.spending = spending;
	}
	
	public void addSpending(int spending) {
		this.spending += spending;
	}

	public void showTotalPrice() {
		System.out.println("Total Price: "  + Main.formatIDR(this.spending));
	}
}
