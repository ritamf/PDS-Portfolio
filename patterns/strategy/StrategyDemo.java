package strategy;

public class StrategyDemo {
    public static void main(String[] args) {
        double e1 = 5, e2 = 33;
        Context c = new Context(new Sum());
        System.out.println("Result: " + c.compute(e1, e2));
        c.setStrategy(new Subtraction());
        System.out.println("Result: " + c.compute(e1, e2));
        c.setStrategy(new Multiplication());
        System.out.println("Result: " + c.compute(e1, e2));
    }
}