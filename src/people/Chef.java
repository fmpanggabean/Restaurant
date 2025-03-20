package people;
import java.util.*;
import main.Food;


public class Chef {
	private String name;
	private List<String> histories = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public List<String> getFoods() {
		return histories;
	}

	public void setFoods(List<String> foods) {
		this.histories = histories;
	}
	
	public void showCookHistory() {
		
	}
	
	public void addHistory(Food food, int quantity) {
		    String history = String.format("%-25s | Quantity: %-5d", food.getName(), quantity);
		    histories.add(history);
	}
	
}
	
	

