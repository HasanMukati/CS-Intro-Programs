import java.util.Scanner;

public class firstProgram {
	
	public static void main(String[] args)
	{
			System.out.println("Hello out there.");
			System.out.println("I will add prices of gorceries for you");
			System.out.println("Enter the prices of all items in a line");
			int n1, n2, n3, n4, n5;
			Scanner hasan = new Scanner (System.in);
			n1 = hasan.nextInt(); 
			n2 = hasan.nextInt();
			n3 = hasan.nextInt();	
			n4 = hasan.nextInt();
			n5 = hasan.nextInt();
			int sum = n1 + n2 + n3 + n4 + n5;
			System.out.println ("The sum of these is");
		
	}
}
