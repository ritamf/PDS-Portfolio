public class Demo {
    public static void main(String[] args) {
		ATMmachine atmMachine = new ATMmachine();
		
		atmMachine.insertCard();
		atmMachine.ejectCard();

		atmMachine.insertCard();
		atmMachine.insertPin(1234);
		atmMachine.requestCash(2000);

		atmMachine.insertCard();
		atmMachine.insertPin(1234);
    }
}
