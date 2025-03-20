package people;

import java.util.LinkedHashSet;
import java.util.Set;

import restaurant.Order;

public class Chef {

	private String name;
	private Set<Order> cookHistory = new LinkedHashSet<>(); 

	public Chef(String name) {
		this.name = name;
		
	}
	
	public void show() {
		System.out.println("- " + name);
	}
	
	public void order(Order order) {
		cookHistory.add(order);
	}

	public void showCookHistory() {
		System.out.println(name + "'s Cook History:");
		cookHistory.forEach(Order::show);
	}

}
