package people;

import java.util.ArrayList;

public class Chef {

	private String name;
	private ArrayList<String> orderHistory = new ArrayList<String>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showCookHistory() {
		for(String history: orderHistory) {
			System.out.println(history);
		}
		
	}

	public ArrayList<String> getOrderHistory() {
		return orderHistory;
	}

	public void setOrderHistory(String history) {
		this.orderHistory.add(history);
	}

	


	
}
