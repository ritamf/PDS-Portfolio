public class PizzaMaker {
    public static void main(String[] args) {
        Pizza dopePizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        
        System.out.println("Ingredients: " + dopePizza.getDescription());
        System.out.println("Price: " + dopePizza.getCost());

    }
}
