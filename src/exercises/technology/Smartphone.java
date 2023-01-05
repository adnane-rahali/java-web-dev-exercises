package exercises.technology;

public class Smartphone extends Computer{
    private final String color;

    public Smartphone(double weight, String make, String model, double price, String condition, String color){
        super(weight, make, model, price, condition);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean iPhoneDeal(){
        return this.getMake().equals("iPhone") && this.getPrice() < 100;
    }

    @Override
    public boolean isHeavy() {
        return this.getWeight() > 300;
    }
}
