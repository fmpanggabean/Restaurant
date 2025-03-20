package restaurant;

import people.Chef;
import people.Visitor;
import java.util.*;

public class Restaurant {
	private String name;
	private List <Menu> menuList = new ArrayList<>();
	private List <Chef> chefList = new ArrayList<>();
	private int totalIncome;
	public Restaurant(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.totalIncome = 0;
	}

	public void addChef(Chef chef) {
		// TODO Auto-generated method stub
		chefList.add(chef);
	}

	public void addMenu(Menu menu) {
		// TODO Auto-generated method stub
		menuList.add(menu);
	}

	public void showMenu() {
		// TODO Auto-generated method stub
		System.out.println("Menu in " + name + ":");
        for (Menu menu : menuList) {
            menu.showMenu();
        }
		
	}

	public void showChef() {
		// TODO Auto-generated method stub
		System.out.println("Chefs in " + name + ":");
        for (Chef chef : chefList) {
            System.out.println("- " + chef.getName());
        }
		
	}

	public void order(Chef chef, Visitor visitor, String name, int qty) {
		// TODO Auto-generated method stub
		Food orderedFood = null;
        for (Menu menu : menuList) {
            orderedFood = menu.getFood(name);
            if (orderedFood != null) break;
        }

        if (orderedFood != null) {
            double price = orderedFood.getPrice() * qty;
            visitor.addToTotal(price);
            chef.addCookHistory(name, qty);
            totalIncome += price;
            System.out.println(visitor.getName() + " ordered " + qty + " " + name + " (prepared by " + chef.getName() + ")");
        } else {
            System.out.println("Food " + name + " not found!");
        }
	}

	public void showTotalIncome() {
		// TODO Auto-generated method stub
		System.out.println("Total Income: " + totalIncome);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
