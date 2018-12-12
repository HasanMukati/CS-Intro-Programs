import java.util.Scanner;

public class Hangman {

  private String secretWord;
  private String disguisedWord;
  private String letters;
  private int numberOfGuesses;
  private int numberOfIncorrectGuesses;

  public void initialize( String secretWord ) {
    this.secretWord = secretWord;
    this.disguisedWord = "";
    for ( int i = 0; i < secretWord.length( ); i++ ) {
      disguisedWord += "?";
    }
  }

  public void makeGuess( char guess ) {
    boolean match = false;
    for ( int i = 0; i < secretWord.length( ); i++ ) {
      if ( secretWord.charAt( i ) == guess ) {

        StringBuilder newString = new StringBuilder( disguisedWord );
        newString.setCharAt( i, guess );

        disguisedWord = newString.toString( );

        match = true;
      }
    }
    if ( !match ) {
      numberOfIncorrectGuesses++;
    }
  }

  public boolean isFound( ) {
    if ( disguisedWord.contains( "?" ) ) {
      return false;
    } else {
      System.out.println( "You win" );
      return true;
    }
  }

  public String getSecretWord( ) {
    return secretWord;
  }

  public String getDisguisedWord( ) {
    return disguisedWord;
  }

  public void playGame( ) {
    while ( !isFound( ) ) {
      System.out.println( "The  word is <" + disguisedWord + ">" );
      numberOfGuesses++;
      System.out.println( "Guess a letter: " );
      makeGuess( new Scanner( System.in ).next( ).charAt( 0 ) );

      System.out.println( " Guesses made " + numberOfGuesses + " with "
          + numberOfIncorrectGuesses + " wrong" );
    }
  }

}