package people;

import java.util.ArrayList;

import restaurant.Food;

public class Chef {
	private String name; 
	private ArrayList<String> cookFood; 
	
	public Chef(String name) {
		this.name = name; 
		this.cookFood = new ArrayList<>(); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addCookFood(String name) {
		cookFood.add(name); 
	}

	public void showCookHistory() {
		System.out.println(name + "'s cook history: ");
		for(String name: cookFood) {
			System.out.println("   - " + name);
		}
		System.out.println();
	}
	
	

}
