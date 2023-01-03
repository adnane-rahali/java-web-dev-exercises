package studios.Restaurant;
import java.util.*;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    private String category;
    private String isNew;
    private Date lastUpdated;

    public MenuItem(String name, double price, String description, String category, String isNew, Date lastUpdated) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.lastUpdated = lastUpdated;
    }

    public double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public String getIsNew() {
        return isNew;
    }

    private void setIsNew(String isNew) {
        this.isNew = isNew;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    private void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public boolean isItemNew(){
        return this.isNew.equals("New");
    }

    @Override
    public String toString() {
        return "{" + name + ", " + price + ", " + description + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) && category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}
