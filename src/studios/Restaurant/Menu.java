package studios.Restaurant;

import java.util.*;

public class Menu {
    private HashMap<String, MenuItem> menu;

    public Menu(HashMap<String, MenuItem> menu) {
        this.menu = menu;
    }

    public HashMap<String, MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(HashMap<String, MenuItem> menu) {
        this.menu = menu;
    }

    public void addItem(MenuItem i){
        if(!this.menu.containsKey(i.getName())) {
            menu.put(i.getName(), i);
        }
        else {
            System.out.println("Item is already in the menu.");
        }
    }
    public void removeItem(MenuItem e){
        menu.remove(e.getName());
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String res = "";
        for(MenuItem e : this.menu.values()){
            res = res + e.toString() + "\n";
        }
        return res.strip();
    }
}
