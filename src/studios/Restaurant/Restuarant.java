package studios.Restaurant;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import static java.util.Calendar.*;

public class Restuarant {
    public static void main(String[] args){
        Calendar cal1 = Calendar.getInstance(); cal1.set(Calendar.YEAR, 2014);
        cal1.set(Calendar.MONTH, Calendar.JANUARY);cal1.set(Calendar.DAY_OF_MONTH, 1);
        Date d1 = cal1.getTime();

        Calendar cal2 = Calendar.getInstance(); cal2.set(Calendar.YEAR, 2022);
        cal2.set(Calendar.MONTH, MARCH);cal2.set(Calendar.DAY_OF_MONTH, 14);
        Date d2 = cal2.getTime();

        MenuItem shawarma = new MenuItem("Shawarma", 9.99,
                "Wrapped beef sandwich with veggies and sauce", "main course",
                "Old", d1);

        MenuItem salad = new MenuItem("Salad", 6.99,
                "Mixed salade", "appetizer",
                "New", d2);

        HashMap<String, MenuItem> m = new HashMap<>();
        m.put("Shawarma", shawarma);
        m.put("Salad", salad);
        Menu menu = new Menu(m);

        System.out.println(shawarma);
        System.out.println();
        System.out.println(menu);
        System.out.println();
        menu.removeItem(shawarma);
        System.out.println();
        menu.addItem(salad);
        System.out.println();
        System.out.println(menu);
    }
}
