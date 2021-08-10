public class NoCard implements ATMState {

    ATMmachine atmMachine;

    public NoCard(ATMmachine newATMmachine) {
        this.atmMachine = newATMmachine;
    }

    @Override
    public void insertCard() {
        this.atmMachine.setATMState(atmMachine.getYesCardState());
        System.out.println("A card has been inserted");
        
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
