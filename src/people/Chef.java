package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> orders = new ArrayList<String>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getOrders() {
		return orders;
	}

	public void setOrders(String order) {
		this.orders.add(order);
	}

	public void showCookHistory() {
		System.out.println("\n================================================================================");
		System.out.println("Cook history chef " + this.name + ":");
		for (String order : orders) {
			System.out.println(order);
		}
	}
	
	
}
