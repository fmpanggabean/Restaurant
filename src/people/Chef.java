package people;

//import java.util.*;
import java.util.*;

public class Chef {
    String name;
    List<String> cookHistory = new ArrayList<>();

    public Chef(String name){
        this.name = name;
    }

    public void cook(String foodName, int quantity){
        cookHistory.add(foodName + " x" + quantity);
    }

    public void showCookHistory(){
        System.out.println("- " + name + " cooked: ");
        for(String record : cookHistory){
            System.out.println("    -" + record);
        }
    }

    public String toString(){
        return "- " + name;
    }
}
