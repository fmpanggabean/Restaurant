package restaurant;

import java.util.ArrayList;

public class Menu {
	private String name;
	private ArrayList<Food>foods = new ArrayList<>();

	public Menu(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void add(Food food) {
		foods.add(food);
		
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}
	
	public void display() {
		System.out.println("category: ");
		
		for(Food food: foods) {
			System.out.println("- "+ food.getName() + " price: "+ food.getPrice());
		}
	}

	public Food getFood(String name) {
		for(Food food: foods) {
			if(food.getName().equals(name)) {
				return food;
			}
		}
		return null;
	}

}
