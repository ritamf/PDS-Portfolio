public class BikeMediator implements Mediator {

    private int numBikes;

    public BikeMediator(int numAllBikes) {
        this.numBikes = numAllBikes;
    }

    @Override
    public void rent(User user) {

        if ( this.numBikes == 0 )
            System.out.println("INFO: " + user.getUserID() + " can't rent a bike since there aren't any.");

        else if ( user.hasRented() ) 
            System.out.println("INFO: " + user.getUserID() + " can't rent more than one bike.");

        else {
            this.numBikes--;
            System.out.println(user.getUserID() + " has successfully rented a bike!");
        }
    }

    @Override
    public void deliver(User user) {

        if ( !user.hasRented() )
            System.out.println("INFO: " + user.getUserID() + " can't deliver a bike since they don't have any.");

        else {
            this.numBikes++;
            System.out.println(user.getUserID() + " has successfully delivered a bike!");
        }

    }

    @Override
    public int getNumBikes() {
        return numBikes;
    }
}
