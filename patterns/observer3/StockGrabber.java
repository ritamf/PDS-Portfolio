import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        observers.remove(observerIndex);

        System.out.println("Observer " + (observerIndex+1) + " deleted");
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIBMPrice(double newIbmPrice) {
        this.ibmPrice = newIbmPrice;
        notifyObservers();
    }

    public void setApplePrice(double newApplePrice) {
        this.applePrice = newApplePrice;
        notifyObservers();

    }

    public void setGooglePrice(double newGooglePrice) {
        this.googlePrice = newGooglePrice;
        notifyObservers();
    }
}
