public class BurgerChef extends Chef {
    @Override
    public void handle(String request) {

        System.out.print("BurgerChef: ");

        request = request.toLowerCase();

        if (request.contains("burger")) 
            System.out.println("Starting to cook " + request + ". Out in 19 minutes!");
        else {
            System.out.println("I can't cook that.");
            super.handle(request);
        }
    }
}
