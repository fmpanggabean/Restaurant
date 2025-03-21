package restaurant;
import java.util.*;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private List<Chef> chefList = new ArrayList<>();
	private List<Menu> menuList = new ArrayList<>();
	private Integer totalIncome = 0;
	
	public void addChef(Chef chef) {
		chefList.add(chef);
	}
	
	public void addMenu(Menu menu) {
		menuList.add(menu);
	}
	
	public void showMenu() {
		for(int i = 0; i < menuList.size(); i++) {
			List<Food> foodList = menuList.get(i).getFoodList();
			System.out.println(name + "'s " + menuList.get(i).getName() + ":");
			for(int j = 0; j < foodList.size(); j++) {
				System.out.println("- " + foodList.get(j).getName());
			}
			System.out.println();
		}
	}
	
	public void showChef() {
		System.out.println(name + "'s chefs:");
		for(int i = 0; i < chefList.size(); i++) {
			System.out.println("- " + chefList.get(i).getName());
		}
		System.out.println();
	}
	
	public void order(Chef chef, Visitor visitor, String name, Integer quantity) {
		Integer found = 0;
		Integer price = 0;
		for(int i = 0; i < menuList.size(); i++) {
			List<Food> foodList = menuList.get(i).getFoodList();
			for(int j = 0; j < foodList.size(); j++) {
				if(foodList.get(j).getName().equals(name)) {
					found = 1;
					price = quantity * foodList.get(j).getPrice();
					break;
				}
			}
		}
		
		if(found == 0) {
			System.out.println("Food not found\n");
			return;
		}
		visitor.setTotalPrice(visitor.getTotalPrice() + price);
		chef.getCookHistory().add(name);
		totalIncome = totalIncome + price;
		System.out.println("Order completed\n");
	}
	
	public void showTotalIncome() {
		System.out.println(name + " total income : " + totalIncome);
	}

	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

