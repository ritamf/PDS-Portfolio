public class Mozzarella extends PizzaDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);

        System.out.println("Mozarella Pizza added");

    }

    public String getDescription() {
        return tempPizza.getDescription() + ", Mozarella";
    }

    public double getCost() {   
        return tempPizza.getCost() + .50;
    }
}
