package people;

import java.util.*;

public class Chef {
    String name;
    List <String> history = new ArrayList<>();

    public String getName() {
        return name;
    }
    public Chef(String name) {
        this.name = name;
    }

    public void addOrder(String name, int quant){
        String order = name + " with quantity of " + quant;
        history.add(order);
    }

    public void showCookHistory(){
        System.out.println(name + " cook history:");
        for(String string : history){
            System.out.printf(string + "\n");
        }
        System.out.println("=================");
    }
}
