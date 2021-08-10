package ex2.thermoMVC.view;

import ex2.thermoMVC.model.Thermometer;
import ex2.thermoMVC.model.ThermometerListener;

public class ConsoleDisplay implements ThermometerListener {

    private Thermometer thermometer;

    public ConsoleDisplay(Thermometer t) {
        this.thermometer = t;
    }

    @Override
    public void temperatureChanged() {

        // note: this prints a new line in Eclipse but the number is 
        // rewritten in the same line in other terminals
        // https://stackoverflow.com/questions/4573123/java-updating-text-in-the-command-line-without-a-new-line
        System.out.print("\r" + this.thermometer.getTemperature());
        
	}
}
