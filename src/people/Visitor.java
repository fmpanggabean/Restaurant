package people;

import java.util.ArrayList;

import restaurant.Food;

public class Visitor {
    private String name;
    private int totalSpent = 0;    
    private ArrayList<Food> foods = new ArrayList<>();

    public Visitor(String name){
        this.name = name;
    }   

    public String getName(){
        return name;
    }

    public void order(Food food, int quantity){
        totalSpent += (int) food.getPrice()*quantity;
        foods.add(food);
    }

    public void showTotalPrice(){
    	System.out.println();
    	System.out.println(name + " ordered: ");
    	for (Food food : foods) {
             System.out.println(" - " + food.getName());
		}
        System.out.println("   Total price: Rp " + totalSpent);
    }
}
