public class ATMmachine { // context
    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfMoney;

    ATMState atmState;

    int cashMachine = 2000;
    boolean correctPinEntered = false;

    public ATMmachine() {
        this.hasCard = new HasCard(this);
        this.noCard = new NoCard(this);
        this.hasCorrectPin = new HasPin(this);
        this.atmOutOfMoney = new NoCash(this);

        this.atmState = this.noCard;

        if (this.cashMachine <= 0)
            atmState = atmOutOfMoney;

    }

    public void setATMState(ATMState newAtmState) {
        this.atmState = newAtmState;
    }

    public void setCashInMachine(int newCashMachine) {
        this.cashMachine = newCashMachine;
    }

    public void insertCard() {
        this.atmState.insertCard();
    }

    public void ejectCard() {
        this.atmState.ejectCard();
    }

    public void requestCash(int cashToWithdraw) {
        this.atmState.requestCash(cashToWithdraw);
    }

    public void insertPin(int pinInserted) {
        this.atmState.insertPin(pinInserted);
    }

    public ATMState getYesCardState() {
        return this.hasCard;
    }

    public ATMState getNoCardState() {
        return this.noCard;
    }

    public ATMState getHasPinState() {
        return this.hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return this.atmOutOfMoney;
    }

}
