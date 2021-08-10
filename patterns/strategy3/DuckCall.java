public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        quackBehavior = new Quack();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
