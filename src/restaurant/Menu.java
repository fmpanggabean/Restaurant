package restaurant;

import java.util.*;

public class Menu {
	private String category; 
	private List<Food> foods = new ArrayList<>(); 

	public Menu(String category) {
		this.category = category; 
	}

	public void add(Food food) {
		foods.add(food); 
		
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Food> getFoods() {
		return foods;
	}

	public void setFoods(List<Food> foods) {
		this.foods = foods;
	}

	public void showMenu() {
		System.out.println("\n=== Kategori: " + category + " ===");
	    if (foods.isEmpty()) {
	        System.out.println("Tidak ada makanan dalam kategori ini.");
	    } else {
	        for (Food food : foods) {
	            System.out.println("- " + food.getName() + " (Rp " + food.getPrice() + ")");
	        }
	    }
		
	}
	
	

}
