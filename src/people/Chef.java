package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> history = new ArrayList<String>();

	public Chef(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addHistory(String message) {
		history.add(message);
	}

	public void showCookHistory() {
		System.out.println("\nHistory: ");
		history.forEach((m) -> {
			System.out.println("- " + m);
		});
		
	}
	
	
}
