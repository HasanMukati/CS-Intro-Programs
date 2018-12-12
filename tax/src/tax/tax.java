package tax;
import java.util.Scanner;
public class tax {



	public static void main(String[] args) {
	
	System.out.println("I will print out your tax based on your income");
	Double income;
	Double tax;
	Scanner keyboard = new Scanner(System.in);
    System.out.println("What is your income: ");
    income = keyboard.nextDouble();
    
   
 
    
    if (income <= 50000)
    	System.out.println("Your tax is: " + income * .01);
    
    if ((income > 50000) && (income <= 75000))
    	System.out.println("Your tax is: " + ((50000 * 0.01) + (income - 50000) * 0.02));
    
    if ((income > 75000) && (income <= 100000))
    	System.out.println("Your tax is: " + (500 + ((income - 50000) * 0.02) + ((income - 75000) * 0.03)));
    
    if ((income > 100000) && (income <= 250000))
    	System.out.println("Your tax is: " + income * .04);
    
    if ((income > 250000) && (income <= 500000))
    	System.out.println("Your tax is: " + income * .05);
    
    if (income > 500000)
    	System.out.println("Your tax is: " + income * .06);
     }}
	
