package people;

import main.Main;

public class Visitor {
	private String name;
	private Integer totalPay = 0;

	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addPayment(Integer price) {
		this.totalPay += price;
	}

	public void showTotalPrice() {
		
		System.out.println("Total bill for " + this.name + " is " + Main.formatIDR(this.totalPay));
	}
	

}
