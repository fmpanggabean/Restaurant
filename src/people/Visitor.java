package people;

import java.util.*;

public class Visitor {
    String name;
    int totalPrice = 0;
    List <String> history = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Visitor(String name) {
        this.name = name;
    }

    public void totalingPrice(int foodprice){
        totalPrice += foodprice;
    }

    public void addOrder(String name, int quant){
        String order = name + " with quantity of " + quant;
        history.add(order);
    }

    public void showTotalPrice(){
        System.out.println(name + " order:");
        for(String string : history){
            System.out.printf(string + "\n");
        }
        System.out.println("Total : " + totalPrice);
        System.out.println("==================");
    }
}
