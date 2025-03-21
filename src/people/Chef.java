package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> orderHistories = new ArrayList<String>();

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
		System.out.println("Chef " + this.name + "'s Cooking History: ");
		for (String string : orderHistories) {
			System.out.println("   o " + string);
		}
//		System.out.println(" ");
	}

	public ArrayList<String> getOrderHistories() {
		return orderHistories;
	}

	public void setOrderHistories(String orderHistories) {
		this.orderHistories.add(orderHistories);
	}

}
