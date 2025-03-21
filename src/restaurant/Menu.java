package restaurant;

import java.util.ArrayList;

public class Menu {
	public String cateFood;
	public ArrayList<Food> foods = new ArrayList<Food>();

	public Menu(String cateFood) {
		super();
		this.cateFood = cateFood;
	}

	public Menu(ArrayList<Food> foods) {
		super();
		this.foods = foods;
	}

	public void add(Food food) {
		// TODO Auto-generated method stub
		foods.add(food);
	}
	
	
}
