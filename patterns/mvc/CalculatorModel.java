package mvc;

public class CalculatorModel {
    public int calculationValue;

    public void addTwoNums(int firstNum, int secNum) {
        calculationValue = firstNum + secNum;
    }

    public int getCalculationValue() {
        return this.calculationValue;
    }

}
