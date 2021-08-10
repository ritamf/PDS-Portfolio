package mvc;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorController {

    private CalculatorView theView;
    private CalculatorModel theModel;

    public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener( new CalculateListener() );
    }

    class CalculateListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNums(firstNumber, secondNumber);

                int result = theModel.getCalculationValue();

                theView.setCalcSolution(result);
            
            } catch (NumberFormatException ex) {
                theView.displayErrorMensage("You need to enter 2 integers");
            }
            
        }

    }
}
