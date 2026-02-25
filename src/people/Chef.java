package people;

import java.util.ArrayList;

import restaurant.Food;

public class Chef {
	private String chefName;
	private ArrayList<Food>foods = new ArrayList<Food>();
	private ArrayList<Integer> amounts = new ArrayList<Integer>();
	public Chef(String chefName) {
		this.chefName = chefName;
	}
	public String getChefName() {
		return chefName;
	}

	public void setChefName(String chefName) {
		this.chefName = chefName;
	}
	
	public ArrayList<Food> getFoods() {
		return foods;
	}
	public void setFoods(ArrayList<Food> foods) {
		this.foods = foods;
	}
	public ArrayList<Integer> getAmounts() {
		return amounts;
	}
	public void setAmounts(ArrayList<Integer> amounts) {
		this.amounts = amounts;
	}
	public void addOrder(Food food , int amount) {
		this.foods.add(food);
		this.amounts.add(amount);
	}
	public void showCookHistory(){
		System.out.println(this.chefName+ "'s Cooking History.");
		for(int i = 0 ; i < foods.size() ; i++) {
			System.out.println("   "+foods.get(i).getFoodName()+": "+ amounts.get(i));
		}
		
	}
	
}
