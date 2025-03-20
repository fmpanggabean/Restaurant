package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistories = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void cook(String foodName, Visitor visitor, int amount) {
		cookHistories.add("Cooked " + amount + " " + foodName + " for " + visitor.getName());
	}

	public void showCookHistory() {
		System.out.println("Cook History of Chef " + name + ":");
		for(String cookHistory : cookHistories) {
			System.out.println("- " + cookHistory);
		}
	}
	
}
