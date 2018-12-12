
public class Die {

	


        //instance variables – remember instance variables should be private
        private int numFaces;   // number of sides on the die
        private int faceValue;  // current value showing on the die

        //Construct a six-sided die, initially showing 1.
        public D () {
            numFaces = 6;
            faceValue = 1;
        }

        //Method to roll the die and return the result.
        public int roll () {
            faceValue = (int) (Math.random() * numFaces) + 1;
            return faceValue;
        }

        //Method to return the current die value.
        public int getFaceValue () {
            return faceValue;
        }
     }