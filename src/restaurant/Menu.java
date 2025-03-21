package restaurant;

import java.util.ArrayList;

public class Menu {
	private String category;
	private ArrayList<Food>foods=new ArrayList<>();

	public Menu(String category) {
		this.category = category;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public void show() {
		System.out.println(category+" Kategori:");
		for(Food food:foods) {
			System.out.println("- "+food.getName()+" (Rp "+food.getPrice()+")");
		}
	}

	public Food getFood(String name) {
		for(Food food : foods) {
			if(food.getName().equalsIgnoreCase(name)) {
				return food;
			}
		}
		return null;
	}
}
