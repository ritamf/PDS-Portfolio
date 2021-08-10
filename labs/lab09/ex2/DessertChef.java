public class DessertChef extends Chef {
    @Override
    public void handle(String request) {

        System.out.print("DessertChef: ");

        request = request.toLowerCase();

        if (request.contains("dessert")) 
            System.out.println("Starting to cook " + request + ". Out in 17 minutes!");
        else {
            System.out.println("I can't cook that.");
            super.handle(request);
        }
    }
}
