package restaurant;

import people.Visitor;

public class Order {
	private Visitor visitor;
	private Food food;
	private int quantity;
	
	public Order(Visitor visitor, Food food, int quantity) {
		this.visitor = visitor;
		this.food = food;
		this.quantity = quantity;
	}
	
	public void show() {
		System.out.println("- Cooked " + quantity +  " pcs of " +
				food.getName() + " for " + visitor.getName());
	}
	
	public int getPrice() {
		return food.getPrice() * quantity;
	}
}
