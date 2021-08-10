public class HasPin implements ATMState {

    ATMmachine atmMachine;

    public HasPin(ATMmachine newATMmachine) {
        this.atmMachine = newATMmachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't insert more than one card");  
    }

    @Override
    public void ejectCard() {
        this.atmMachine.setATMState(atmMachine.getNoCardState());
        System.out.println("The card has been ejected");
    }

    @Override
    public void insertPin(int pinEntered) {
        System.out.println("Can't insert pin since it has already been done");
    }

    @Override
    public void requestCash(int cashToWithdraw) {
        if (cashToWithdraw > this.atmMachine.cashMachine) {
            System.out.println("The machine doesn't have that cash, so it will eject the card");
            this.ejectCard();

        } else {
            this.atmMachine.cashMachine -= cashToWithdraw;
            System.out.println("The machine has given " + cashToWithdraw + " to you");
            this.ejectCard();
            
            if (atmMachine.cashMachine == 0) {
                this.atmMachine.setATMState(atmMachine.getNoCashState());
                System.out.println("The machine ran out of money");
            }
        }

    }
    
}
