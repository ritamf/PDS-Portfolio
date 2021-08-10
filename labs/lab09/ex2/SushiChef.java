public class SushiChef extends Chef {
    
    @Override
    public void handle(String request) {

        System.out.print("SushiChef: ");

        request = request.toLowerCase();

        if (request.contains("sushi")) 
            System.out.println("Starting to cook " + request + ". Out in 14 minutes!");
        else {
            System.out.println("I can't cook that.");
            super.handle(request);
        }
    }

}
