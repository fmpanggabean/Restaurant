package main;

import restaurant.Menu;
import restaurant.Restaurant;
import people.Chef;
import people.Visitor;

public class Main {

	public static void main(String[] args) {	
		Restaurant restaurant = new Restaurant("Rumah Sambal");
		
		System.out.println("Welcome To Restaurant");
		System.out.println("==> " + restaurant.getName() + " <==");
		System.out.println();
		
		Chef chef1 = new Chef("Bintang");
		Chef chef2 = new Chef("Sawitri");
		
		restaurant.addChef(chef1);
		restaurant.addChef(chef2);
		
		Visitor visitor1 = new Visitor("Ebednezer");
		Visitor visitor2 = new Visitor("Granite");
		
		Menu mainCourse = new Menu("Main Course"); // ada 4 makanan dalam menu mainCourse
		
		mainCourse.add(new Food("Nasi Bakar", 30000));
		mainCourse.add(new Food("Nasi Goreng", 230000));
		mainCourse.add(new Food("Mie Goreng", 20000));
		mainCourse.add(new Food("Udang Emas", 999000));
		
		restaurant.addMenu(mainCourse);
		
		Menu dessert = new Menu("Dessert");
		
		dessert.add(new Food("Ice Cream", 1000));
		dessert.add(new Food("Es Pisang Ijo", 23000));
		dessert.add(new Food("Jus Emas", 999000));
		
		restaurant.addMenu(dessert);
		
		restaurant.showMenu();
		restaurant.showChef();
		
		restaurant.order(chef1, visitor1, "Nasi Bakar", 2);
		restaurant.order(chef1, visitor1, "Jus Emas", 2);
		
		restaurant.order(chef2, visitor2, "Udang Emas", 9);
		restaurant.order(chef2, visitor2, "Ice Cream", 90);
		
		System.out.println("===== TOATAL PRICE =====");
		visitor1.showTotalPrice();
		visitor2.showTotalPrice();

		
		System.out.println("\n===== HISTORY OF ORDERS =====");
		chef1.showCookHistory();
		chef2.showCookHistory();
		
		restaurant.showTotalIncome();
	}
}
