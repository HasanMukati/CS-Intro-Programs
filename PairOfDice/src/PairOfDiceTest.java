import PairOfDice;

public class PairOfDiceTest {


	

	  public class PairOfDice {

	        //instance variables
	        private Die die1, die2;
	        private int value1, value2, total;

	        //Construct two Die objects, both with an initial face value of one.
	       public PairOfDice () {
	            die1 = new Die();
	            die2 = new Die();
	            value1 = 1;
	            value2 = 1;
	            total = value1 + value2;
	        }

	        //Method to roll both dice and return the combined result.
	        public int roll () {
	             value1 = die1.roll();
	             value2 = die2.roll();
	             total = value1 + value2;
	             return total;

	        }

	        //Method to returns the current combined dice total.
	        public int getTotal () {
	             return total;
	        }

	        //Method to returns the current value of the first die.
	        public int getDie1 () {
	            return value1;
	        }

	        //Method to returns the current value of the second die.
	        public int getDie2 () {
	            return value2;
	        }
	 }//end class
