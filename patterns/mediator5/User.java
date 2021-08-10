public class User {

    private Mediator mediator;
    private String userID;
    private boolean rentState;

    public User(int userID, Mediator newMediator) {
        this.mediator = newMediator;
        this.userID = "user"+userID;
        this.rentState = false;
    }

    public void rent() {
        mediator.rent(this);
        rentState = true;
    }

    public void deliver() {
        mediator.deliver(this);
        rentState = false;
    }



    public boolean hasRented() {
        return this.rentState;
    }
    
    public String getUserID() {
        return this.userID;
    }
}
