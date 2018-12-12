import java.util.Scanner;

public class THeconvertor 
{
	public static void main(String[] args)
	{
		double meters, miles, feet, inches;
		Scanner key = new Scanner (System.in);
		System.out.println("This program converts meters into miles, feet and inches");
		System.out.println("Enter the number of meters");
		meters = key.nextDouble();
		miles = meters / 1609.344; 
		feet = meters * 3.28;
		inches = meters * 39.37;
		System.out.println("The number of miles is: " + miles);
		System.out.println("The number of feet is: " + feet);
		System.out.println("The number of inches is: " + inches);
	}
	

}
