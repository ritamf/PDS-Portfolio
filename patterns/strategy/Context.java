package strategy;

public class Context {
    private Strategy opStrategy;

    public Context(Strategy operation) {
        this.opStrategy = operation;
    }

    public double compute(double firstNumber, double secondNumber) {
        return opStrategy.compute(firstNumber, secondNumber);
    }

    public void setStrategy(Strategy strategy) {
        opStrategy = strategy;
    }
}