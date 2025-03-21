package people;

import main.Main;

public class Visitor {
	private String name;
	private int totalPrice = 0;

	public Visitor(String name) {
		this.name = name;
	}
	
	public void addTotal(int price) {
		totalPrice += price;
	}

	public void showTotalPrice() {
		System.out.println(name+" telah menghabiskan uang sebanyak "+Main.formatIDR(totalPrice));
	}

	public String getName() {
		return name;
	}
}
