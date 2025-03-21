package people;

import java.util.ArrayList;

import main.Main;
import restaurant.Food;

public class Chef{
	private String name;
	private ArrayList<Food> history = new ArrayList<>();
	private ArrayList<Integer> banyak = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Food> getHistory() {
		return history;
	}

	public void setHistory(ArrayList<Food> history) {
		this.history = history;
	}

	public ArrayList<Integer> getBanyak() {
		return banyak;
	}

	public void setBanyak(ArrayList<Integer> banyak) {
		this.banyak = banyak;
	}
	
	public void addFoodToHistory(Food food) {
		history.add(food);
	}
	
	public void addQuantityToHistory(Integer byk) {
		if(banyak == null) return;
		banyak.add(byk);
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println("+-------------------------------------+");
		System.out.println("|                 Chef                |");
		System.out.println("+-------------------------------------+");
		System.out.println(this.name + "'s cook history: ");
		
		int i = 0;
		for (Food food : history) {
			System.out.println("  - " + food.getName() + " (" + Main.formatIDR(banyak.get(i) * food.getPrice()) + ")");
			System.out.println("      " + banyak.get(i) + " x " + Main.formatIDR(food.getPrice()));
			i++;
		}
	}
	
	
	
	

}
