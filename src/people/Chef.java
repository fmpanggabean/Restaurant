package people;

import java.util.ArrayList;

public class Chef {
	
	private String name;
	private ArrayList<String> orders = new ArrayList<String>();
	
	public ArrayList<String> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<String> orders) {
		this.orders = orders;
	}

	public Chef(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addHistory(String history) {
		orders.add(history);
	}
	public void showCookHistory() {
		System.out.println("========================================");
		for(String s : orders) {
			System.out.println(s);
			
		}
		
	}
	
}
