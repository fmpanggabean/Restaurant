package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String>cookHistory=new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCookHistory(String foodName, int qty) {
		cookHistory.add(qty+"x "+foodName);
	}

	public void showCookHistory() {
		System.out.println("Cooking histor of Chef" + name + ":");
		for(String history: cookHistory) {
			System.out.println("- "+history);
		}
	}
}
