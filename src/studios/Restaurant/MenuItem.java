package studios.Restaurant;
import java.util.*;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private String isNew;
    private Date lastUpdated;

    public MenuItem(double price, String description, String category, String isNew, Date lastUpdated) {
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
}
