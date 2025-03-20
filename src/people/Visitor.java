package people;
import java.util.*;

public class Visitor {
    int total = 0;
    String name;
    List <String> history = new ArrayList<>();

    public String getName() {
        return name;
    }

    public Visitor(String name) {
        this.name = name;
    }

    public void getTotalPrice(int price){
        total += price;
    }

    public void addOrder(String name, int many){
        String order = name + " quantity " + many;
        history.add(order);
    }

    public void showTotalPrice(){
        System.out.println(name + "'s order:");
        for(String string : history){
            System.out.printf(string + "\n");
        }
        System.out.println("Total : " + total);
        System.out.println("------------------");
    }
}