package people;

import main.Helper;

public class Visitor {
	private String name;
	private int totalPrice = 0;
	
	public Visitor(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println(name + " total spent : " + Helper.formatIDR(totalPrice));
	}
	
	public String getName() {
		return name;
	}
	
	public void setTotalPrice(int price) {
		totalPrice += price;
	}

}
