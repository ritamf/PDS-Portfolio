public class TomatoSauce extends PizzaDecorator {

    public TomatoSauce(Pizza newPizza) {
        super(newPizza);

        System.out.println("Tomato Sauce added");

    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Tomato Sauce";
    }

    public double getCost() {   
        return tempPizza.getCost() + .35;
    }
}
