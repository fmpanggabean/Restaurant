package people;

import main.Main;

public class Visitor {
	private String name;
	private int totalPrice = 0;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public void showTotalPrice() {
		System.out.println("+-----------------------------+");
		System.out.println("|     VISITOR TOTAL PRICE     |");
		System.out.println("+-----------------------------+");
		System.out.println(name + " total Price: " + Main.formatIDR(totalPrice));
		System.out.println();
	}
	
	public void addTotalPrice(int price) {
		totalPrice += price;
	}
	
	
}
