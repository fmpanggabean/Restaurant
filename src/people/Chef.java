package people;

import java.util.*;

public class Chef {
	private String name;
	private List<String> histories = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addHistory(String name, int quantity) {
		histories.add("  - " + quantity + " " + name + "(s)");
	}
	
	public void showCookHistory() {
		System.out.println("\n========== Cook History ==========");
		System.out.println("Chef: " + name);
		for(String string : histories) {
			System.out.println(string);
		}
		System.out.println("==================================");
	}
}
