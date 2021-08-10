import java.util.List;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        List<String> requests = new ArrayList<>();
        requests.add("veggie burger");
        requests.add("Pasta Carbonara");
        requests.add("PLAIN pizza, no toppings!");
        requests.add("sushi nigiri and sashimi");
        requests.add("salad with tuna");
        requests.add("strawberry ice cream and waffles dessert");

        Chef chain = new SushiChef().setNextHandler( new PastaChef().setNextHandler( new BurgerChef().setNextHandler( new PizzaChef().setNextHandler( new DessertChef() ) ) ) );

        for (String r : requests) {
            System.out.println("Can i please get a " + r + "?");
            chain.handle(r);
            System.out.println();
        }

    }
}
