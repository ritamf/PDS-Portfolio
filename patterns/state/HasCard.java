public class HasCard implements ATMState {

    ATMmachine atmMachine;

    public HasCard(ATMmachine newATMmachine) {
        this.atmMachine = newATMmachine;
    }

    @Override
    public void insertCard() {
        System.out.println("The machine can't insert more than one card");  
    }

    @Override
    public void ejectCard() {
        this.atmMachine.setATMState(atmMachine.getNoCardState());
        System.out.println("The card has been ejected");
    }

    @Override
    public void insertPin(int pinEntered) {
        if (pinEntered == 1234) {
            System.out.println("Correct PIN");
            this.atmMachine.correctPinEntered = true;
            this.atmMachine.setATMState(atmMachine.getHasPinState());
        
        } else {
            System.out.println("Wrong PIN");
            this.atmMachine.correctPinEntered = false;
            this.ejectCard();
        }
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        System.out.println("Enter PIN first");
        
    }
    
}
