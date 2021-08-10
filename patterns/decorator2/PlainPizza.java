public class PlainPizza implements Pizza {

    public PlainPizza() {
        System.out.println("Plain Pizza added");
    }

    public String getDescription() {
        return "Plain Pizza";
    }

    public double getCost() {
        return 4.00;
    }
}
