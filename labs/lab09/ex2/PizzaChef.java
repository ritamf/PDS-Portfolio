public class PizzaChef extends Chef {
    @Override
    public void handle(String request) {

        System.out.print("PizzaChef: ");

        request = request.toLowerCase();

        if (request.contains("pizza")) 
            System.out.println("Starting to cook " + request + ". Out in 7 minutes!");
        else {
            System.out.println("I can't cook that.");
            super.handle(request);
        }
    }
}
