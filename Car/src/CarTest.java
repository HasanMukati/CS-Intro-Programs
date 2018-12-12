
public class CarTest {


    public static void main(String []args){

       car myHybrid = new car(50); //50 miles per gallon

       myHybrid.addGas(20); // Tank 20 gallons

       myHybrid.drive(100); // Drive 100 miles

       System.out.println(myHybrid.getGasLevel()); 
    }

}