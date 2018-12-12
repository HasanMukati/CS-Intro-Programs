import java.util.Scanner;
public class car {

	 double fuelEfficiency;
	    double amountOfFuel;

	    public car(double fuelEfficiency) {
	        this.fuelEfficiency = fuelEfficiency;
	        this.amountOfFuel = 0;
	    }

	    public double getGasLevel() {
	        return this.amountOfFuel;
	    }

	    public void addGas(double gas) {
	        this.amountOfFuel += gas;
	    }

	    public void drive(double miles) {
	        double burnedFuel = miles / fuelEfficiency;
	        this.amountOfFuel -= burnedFuel;
	    }
	}