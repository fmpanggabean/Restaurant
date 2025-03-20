package people;

import main.Food;

public class Visitor {
    private String name;
    public int totalSpent;

    public Visitor (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addTotalSpent(int price){
        totalSpent += price;
    }

    public void showTotalPrice(){
        System.out.println("Show Total Price :\n");
        System.out.printf("Name : %s, Total Spent : %d\n", name, totalSpent);
        System.out.println("=====================================");
    }
}
