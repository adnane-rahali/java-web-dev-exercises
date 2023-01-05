package exercises.technology;

public  class Computer extends AbstractEntity{
    private double weight;
    private String make;
    private String model;
    double price;
    private String condition;

    public Computer(double weight, String make, String model, double price, String condition) {
        super();
        this.weight = weight;
        this.make = make;
        this.model = model;
        this.price = price;
        this.condition = condition;
    }
    public Computer(){
        super();
    }

    public double getWeight() {return weight;}
    public String getMake() {return make;}
    public String getModel() {return model;}
    public double getPrice() {return price;}
    public String getCondition() {return condition;}

    public boolean isHeavy() {return false;}

    public boolean isNew(){return this.condition.equals("new");}
}
