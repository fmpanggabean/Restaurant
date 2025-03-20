package people;
import java.util.*;
import restaurant.Food;

public class Chef {
	private String name; 
	private List<String> cookHistory = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name; 
	}

	public void cook(Food food, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cookHistory.add(food.getName()); 
        }
    }
	
	public void showCookHistory() {
		System.out.println("\nRiwayat Masakan Chef " + name + ":");
        if (cookHistory.isEmpty()) {
            System.out.println("Belum memasak apapun.");
        } else {
            for (String dish : cookHistory) {
                System.out.println("- " + dish);
            }
        }
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
