package people;

import restaurant.Food;

public class Visitor {
	private String name; 
	private double totalPrice; 
	
	public Visitor(String name) {
		this.name = name; 
		this.totalPrice = 0; 
	}

	public void showTotalPrice() {
		System.out.println("\nTotal Tagihan " + name + ": Rp " + totalPrice);
		
	}
	
	public void addTotalPrice(double amount) {
        totalPrice += amount;
    }
	
	public String getName() {
		return name; 
	}

	public void addOrder(Food food, double totalPrice2) {
	    this.totalPrice += totalPrice2;
	    System.out.println(name + " menambahkan " + food.getName() + " seharga Rp " + totalPrice2 + " ke tagihan.");
	}
}
