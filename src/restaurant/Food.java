package restaurant;
import java.util.*;
public class Food {
	private String name;
	private int price;
	private ArrayList<Food> foods = new ArrayList<>();
	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
