package people;

import java.util.*;

public class Chef {
	private String name;
	List <String> histories = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addHistory(String name, int qty) {
		histories.add("Menu: " + name + " (" + qty + " portion)");
	}
	
	public void showCookHistory() {
		System.out.println();
		System.out.println("Chef " + name);
		System.out.println("Chef's Histories: ");
		for(String str : histories) {
			System.out.println(str);
		}
	}
	
}
