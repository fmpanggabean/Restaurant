package people;

import java.util.*;

public class Chef {
	private String name;
	private List<String> history = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addHistory(String name, int jumlah) {
		history.add("- " + name + " (" + jumlah + ")");
	}
	
	public void showCookHistory() {
		System.out.println("\nchef " + name + " Cook Histories: ");
		for(String str : history) {
			System.out.println(str);
		}
	}
}
