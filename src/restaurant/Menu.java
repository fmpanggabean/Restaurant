package restaurant;

import main.Food;
import java.util.ArrayList;

public class Menu {
	private String menu;
	private ArrayList<Food> food = new ArrayList<Food>();
	
	public Menu(String menu) {
		this.menu = menu;
	}

	public void add(Food food) {
		this.food.add(food);
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public ArrayList<Food> getFood() {
		return food;
	}

	public void setFood(ArrayList<Food> food) {
		this.food = food;
	}
	
}