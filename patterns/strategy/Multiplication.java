package strategy;

public class Multiplication implements Strategy {
    @Override
    public double compute(double elem1, double elem2) {
        return elem1 * elem2;
    }
}