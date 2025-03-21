package restaurant;

import java.util.ArrayList;

import people.Chef;

public class Menu {
	private String name;
	private ArrayList<Food> foods = new ArrayList<>();

	public Menu(String name) {
		this.name = name;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public void showMenu() {
		System.out.println("Menu: "+name);
		for(Food food : foods) {
			System.out.println("- "+food.getName()+": "+food.getPrice());
		}
	}

	public String getName() {
		return name;
	}

	public Food getFood(String name) {
		for(Food food : foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}

	
}
