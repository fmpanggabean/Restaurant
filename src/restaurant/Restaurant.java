package restaurant;

import people.Chef;
import people.Visitor;

import java.util.*;

public class Restaurant {
	private String name;
	private List <Chef> chefs = new ArrayList<>();
	private List <Menu> menuList = new ArrayList<>();
	private int totalIncome = 0;
	public Restaurant(String name) {
		this.name = name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public void addMenu(Menu menuCourse) {
		menuList.add(menuCourse);
	}

	public void showMenu() {
		for(Menu i : menuList) {
			System.out.println(i.getMenuName() + " :");
			for(Food l : i.getMenu()) {
				System.out.println(" -"+l.getFoodName());
			}
		}
		
	}

	public void showChef() {
        System.out.println("Chef di " + name + ":");
        for (Chef chef : chefs) {
            System.out.println("- " + chef.getName());
        }
    }

	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
        for (Menu menu : menuList) {
            Food food = menu.getFood(foodName);
            if (food != null) {
                int cost = food.getPrice() * quantity;
                visitor.addTotalCost(cost);
                chef.cook(foodName, quantity);
                totalIncome += cost;
                System.out.println(visitor.getName() + " memesan " + quantity + " " + foodName + " dari Chef " + chef.getName());
                return;
            }
        }
        System.out.println("Menu " + foodName + " tidak tersedia.");
    }
	
	 public void showTotalIncome() {
	        System.out.println("Total pendapatan restoran: " + totalIncome);
	 }


}
