package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistory =  new ArrayList<String>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void cook(String foodOrder) {
		cookHistory.add(foodOrder);
	}
	
	public void showCookHistory() {
		System.out.println("");
		System.out.println("Chef " +name + " History");
		for(String i : cookHistory) {
			System.out.println(i);
		}
	}
}
