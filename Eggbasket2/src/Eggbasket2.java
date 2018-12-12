import java.util.Scanner;
public class Eggbasket2 
{
	public static void main(String[] args)
	
	{
		int numberofbaskets, eggsperbasket, totaleggs;
		Scanner keyboard = new Scanner (System.in);
		System.out.println ("Enter the number of eggs in each basket:");
		eggsperbasket = keyboard.nextInt ();
		System.out.println ("Enter the number of baskets:");
        numberofbaskets = keyboard.nextInt ();
        totaleggs = numberofbaskets * eggsperbasket;
        System.out.println ("If you have");
        System.out.println (eggsperbasket + " eggs per basket and");
        System.out.println (numberofbaskets + " baskets, then");
        System.out.println ("the total number of eggs is " + totaleggs);
        System.out.println ("Now we take two eggs out of each basket.");
        
	}

}
