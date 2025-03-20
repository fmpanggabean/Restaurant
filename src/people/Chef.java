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

    public void addOrder(String name, int many){
        String order = name + " quantity " + many;
        history.add(order);
    }

    public void showCookHistory(){
        System.out.println(name + " cooking history:");
        for(String string : history){
            System.out.println(string);
        }
        System.out.println("-----------------");
    }
}
