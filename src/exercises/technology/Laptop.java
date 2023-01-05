package exercises.technology;

public class Laptop extends Computer{
    private final String type;

    public Laptop(double weight, String make, String model, double price, String condition, String type){
        super(weight, make, model, price, condition);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public boolean isDeal(){
        return this.type.equals("2in1") && price < 1000 && this.getCondition().equals("new");
    }
    @Override
    public boolean isHeavy() {
        return this.getWeight() > 2200;
    }

}
