package people;

import main.Helper;

public class Visitor {

	private String name;
	private int bill = 0;

	public Visitor(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println("Customer Name: " + name + " | Bill(s): " + Helper.formatIDR(bill));
	}

	public String getName() {
		return name;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int qty, Integer price) {
		bill = bill + (qty * price);
	}

}
