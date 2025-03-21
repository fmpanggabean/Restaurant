package people;

import java.util.*;
import restaurant.Food;

public class Chef {
	
	private String name;
	private List<String> cooks = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addCooks(String cook) {
		cooks.add(cook);
	}

	public void showCookHistory() {
		System.out.println("\nChef : " + name);
		System.out.println("Cook History :");
		for( String cook : cooks ) {
			System.out.println( "- " + cook );
		}
		System.out.printf("=================================");
	}
	
	

}
