package leap;
import java.util.Scanner;
public class leap {

	public static void main(String[] args) {
		 
		
		System.out.println("This program will tell you if your input is a leap year");
		Scanner keyboard = new Scanner(System.in);
		int year;
		System.out.print("Enter a year after 1582: ");
		year = keyboard.nextInt();
		 

		if(year < 1582)
			System.out.println("Please enter a 4 digit year after 1582.");
	
		else if ((year % 4 == 0 && year % 100 > 0) || (year % 400 == 0)) 
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + "  not a leap year.");
		
  
	}
}
