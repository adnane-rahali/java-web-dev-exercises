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
}
