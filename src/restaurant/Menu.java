package restaurant;

import java.util.ArrayList;

public class Menu {
	private String foodType;
	private ArrayList<Food> foods = new ArrayList<Food>();
	public Menu(String foodType) {
		this.foodType = foodType;
	}
	
	public ArrayList<Food> getFoods() {
		return foods;
	}
	public void setFoods(ArrayList<Food> foods){
		this.foods = foods;
	}
	public String getTypeFood() {
		return foodType;
	}
	public void setTypeFood(String foodType) {
		this.foodType = foodType;
	}
	
	
	public void add(Food food) {
		this.foods.add(food);
	}
	
}
