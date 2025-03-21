package people;

import restaurant.Restaurant;

public class Visitor {
	private String name;
	private int price;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addPrice(int prices) {
		price += prices;
	}
	
	public void showTotalPrice() {
		System.out.println("");
		System.out.println("==========================================");
		System.out.println(name + " bought with price " + Restaurant.formatIDR(price));
		System.out.println("==========================================");
	}
}