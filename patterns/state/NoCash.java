public class NoCash implements ATMState {

    ATMmachine atmMachine;

    public NoCash(ATMmachine newATMmachine) {
        this.atmMachine = newATMmachine;
    }

    @Override
    public void insertCard() {
        System.out.println("The machine doesn't have money");
        
    }

    @Override
    public void ejectCard() {
        System.out.println("Can't eject a card if there isn't any in the machine");
        
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("A card needs to be inserted first");
        
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("A card needs to be inserted first");
        
    }
    
}
