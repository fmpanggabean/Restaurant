package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private List<Menu> menus;
	private List<Chef> chefs;
	private int income;

	public Restaurant(String name) {
		this.name = name;
		this.menus = new ArrayList<>();
		this.chefs = new ArrayList<>();
		this.income = 0;
	}
	
	public String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(amount);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void showMenu() {
		System.out.println("-- Menu --");
		for (Menu menu : menus) {
			System.out.printf("%s : \n", menu.getName());
			for (Food food : menu.getFoods()) {
				System.out.printf("- %s, %s\n", food.getName(), formatIDR(food.getPrice()));
			}
			System.out.println();
		}
	}

	public void showChef() {
		System.out.println("-- Chef --");
		for (Chef chef : chefs) {
			System.out.printf("- Name : %s\n", chef.getName());
		}
		System.out.println();
	}
	
	public int checkPrice(String name, int qty)
	{
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if (food.getName().equals(name))
				{
					return (food.getPrice() * qty);
				}
			}
		}
		
		return -1;
	}

	public void order(Chef chef, Visitor visitor, String name, int qty) {
		int valid = checkPrice(name, qty);
		
		if(valid == -1)
		{
			return;
		}
		else
		{
			chef.addHistory("- Cooked " + qty + " " + name);
			visitor.addTotalPrice(valid);
			income += valid;
		}
	}
	
	public void showTotalIncome()
	{
		System.out.println("Total Income : " + formatIDR(this.income));
	}

}