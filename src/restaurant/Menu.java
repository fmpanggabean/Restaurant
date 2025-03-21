package restaurant;

import java.util.ArrayList;

public class Menu {
	private String menu;
	private ArrayList<Food> foods = new ArrayList<Food>();

	public Menu(String menu) {
		this.menu = menu;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public String getMenu() {
		return menu;
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}


	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
	
	public Food getFood(String foodName) {
		for(Food food : foods) {
			if(food.getName().equals(foodName)) {
				return food;
			}
		}
		return null;
	}
}
