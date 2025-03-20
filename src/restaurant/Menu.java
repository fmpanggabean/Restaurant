package restaurant;

import java.util.ArrayList;

public class Menu {

	private String name;
	private ArrayList<Food> foods = new ArrayList<>();
	
	public Menu(String name) {
		this.name = name;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getName() {
		return name;
	}

	public void showFood() {
		for(Food food : foods) {
			System.out.println("   - " + food.getName() + " - " + food.getPrice());
		}
		
	}

	public ArrayList<Food> getFood() {
		return foods;
	}

}
