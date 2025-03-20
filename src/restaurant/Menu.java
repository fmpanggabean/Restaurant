package restaurant;

import java.util.ArrayList;

public class Menu {
	private String tipe;
	private ArrayList<Food>foods = new ArrayList<Food>();
	
	public String getTipe() {
		return tipe;
	}

	public void setTipe(String tipe) {
		this.tipe = tipe;
	}

	public Menu(String tipe) {
		this.tipe=tipe;
	}

	public void add(Food food) {
		foods.add(food);
	}

	public ArrayList<Food> getFoods() {
		return foods;
	}

	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
}
