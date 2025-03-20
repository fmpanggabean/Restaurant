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
	
	public void cook(Visitor visitor, String name, int quantity) {
		cookHistory.add("Cook " + quantity + " " + name + " for " + visitor.getName());
	}

	public void showCookHistory() {
		System.out.println(name + "'s cook history:");
		
		for(String s : cookHistory) {
			System.out.println(s);
		}
	}
}
