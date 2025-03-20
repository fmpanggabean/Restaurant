package people;

import java.util.ArrayList;

public class Chef {
    private String name;
    private ArrayList<String> history = new ArrayList<>();
    
    public Chef (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addHistory(String rec){
        history.add(rec);
    }

    public void showCookHistory(){
        System.out.println("Show Cook History :\n");
        System.out.println(name + ": ");
        for(String s : history){
            System.out.printf("  - %s\n", s);
        }
        System.out.println("=====================================");
    }
}
