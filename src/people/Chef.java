package people;

import java.util.ArrayList;

public class Chef {

	private String name;
	private ArrayList<String> cookHistory = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void recordCooking(String foodName, int qty) {
		cookHistory.add(foodName + " x" + qty);
	}
	
	public void showCookHistory() {
		System.out.println("\nChef " + name + "'s Cooking History:");
		for(String h : cookHistory) {
			System.out.println("- " + h);
		}
	}
}
