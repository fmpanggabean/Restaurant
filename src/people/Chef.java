package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
	
	private String name;
	private List<String> orders = new ArrayList<>();
	
	public Chef(String name){
		this.name = name;
		
	}
	
	public String getName(){
		return name;
	}

	public List<String> getOrders() {
		return orders;
	}

	public void setOrders(String order) {
		orders.add(order);
	}

	public void showCookHistory() {
		
		for(String order : orders) {
			System.out.println(order);
		}
		System.out.println("===============================================\n");
		
	}

}
