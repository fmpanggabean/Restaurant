package people;

import java.util.*;

public class Chef {
	
	private String name;
	private ArrayList<String> history = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}

	public void showCookHistory() {
		System.out.println("Chef " + name + "'s cooking history");
		System.out.println("======================================================");
		for(String order : history) {
			System.out.println("  - " + order);
		}
		System.out.println("======================================================");
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getHistory(){
		return history;
	}
}
