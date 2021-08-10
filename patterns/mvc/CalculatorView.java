package mvc;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorView extends JFrame {

    private JTextField firstNumber = new JTextField(10);
    private JLabel additionalLabel = new JLabel("+");

    private JTextField secondNumber = new JTextField(10);
    private JButton calculateButton = new JButton("Calculate");
    
    private JTextField calcSolution = new JTextField(10);

    CalculatorView() {
        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        calcPanel.add(firstNumber);
        calcPanel.add(additionalLabel);
        
        calcPanel.add(secondNumber);
        calcPanel.add(calculateButton);

        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }

    public int getFirstNumber() {
        return Integer.parseInt(this.firstNumber.getText());
    }

    public int getSecondNumber() {
        return Integer.parseInt(this.secondNumber.getText());
    }

    public int getCalcSolution() {
        return Integer.parseInt(this.calcSolution.getText());
    }

    public void setCalcSolution(int solution) {
        calcSolution.setText(Integer.toString(solution));
    }
    
    public void addCalculationListener(ActionListener listenerForCalcButton) {
        calculateButton.addActionListener(listenerForCalcButton);
    }

    void displayErrorMensage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }
}
