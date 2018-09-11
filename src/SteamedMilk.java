public class SteamedMilk extends CondimentsDecorator {
    Beverage beverage;

    public SteamedMilk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
