package age;
import java.util.Scanner;

public class age {
	public static void main(String[] args) {
	
	System.out.println("Who is the oldest and youngest?");
	int Personone , Persontwo , Personthree;
	Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter Person One Age:");
    Personone = keyboard.nextInt();
    System.out.println("Enter Person Two Age:");
    Persontwo = keyboard.nextInt();
    System.out.println("Enter Person Three Age:");
    Personthree = keyboard.nextInt();
    
    
    if ((Personone > Persontwo) &&(Personone > Personthree))
    System.out.println("Person One is the Oldest Person");
    else if ((Personone < Persontwo) &&(Personone < Personthree))
    System.out.println("Person One is the Youngest Person");
    
    if (( Persontwo > Personone) && (Persontwo > Personthree))
    System.out.println("Person two is the Oldest Person");
    else if ((Persontwo < Personone) && (Persontwo < Personthree))
    System.out.println("Person Two is the Youngest Person");
    
    if ((Personthree > Personone) && (Personthree > Persontwo))
    System.out.println("Person Three is the Oldest Person");
    else if ((Personthree < Personone) &&(Personthree < Persontwo)) 
    System.out.println("Person Three is the Youngest Person");        }}
	
