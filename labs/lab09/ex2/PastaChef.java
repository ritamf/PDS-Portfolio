public class PastaChef extends Chef {
    @Override
    public void handle(String request) {
        request = request.toLowerCase();

        System.out.print("PastaChef: ");

        if (request.contains("pasta")) 
            System.out.println("Starting to cook " + request + ". Out in 14 minutes!");
        else {
            System.out.println("I can't cook that.");
            super.handle(request);
        }
    }
}
