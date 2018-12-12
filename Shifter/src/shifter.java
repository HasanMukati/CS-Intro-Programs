import java.util.Scanner; 

public class shifter 

{
	public static void main(String[] args)
    {
		

        String word, righttwo , lefttwo ;

        Scanner keyboard = new Scanner(System.in);
            System.out.print("Enter a word:");
            word = keyboard.nextLine();
            righttwo = (word.substring((0), (word.length()-2)));

            lefttwo = (word.substring((2),(word.length())));

            System.out.println("Shifted two to right: " + righttwo);
            System.out.println("Shifted two to left: " + lefttwo);
            System.out.println("Word Itself: " + word);
    }
}

