/**
 * The blowup program implements an application that
 * this  program will allow the user to play rock papes scissors
 * @author  Sherwin Francis
 * @version 1.0
 * @since   2020-03-11 
 */
 
 // Import libraries:
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

public class RPS {

   
    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static String Winner(int user, int comp) { // Intro the winner finder method
        
        String output = ""; 
        int answer = comp - user; // Subtracts the usernumber from the computer number
        
        if ( answer == 0 ) { // If both numbers are the same
            output = "Tie!";
        } else if ( answer < 0 ){ // If computer has a smaller number
            if (answer == -2) {
                output = "User Wins!"; // User has a paper now!
            } else {
                output = "User Loses!";
            }
        } else { // If the computer has a larger number
            if (answer == 2) { // Computer has a paper now!
                output = "User Loses!";
            } else {
                output = "User Wins!";
            }
        }

        return output;

    }

    public static void main(String[] args) { 
        // Intro map and add the elements:
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put( 1, "Rock" );
        map.put( 2, "Scissors" );
        map.put( 3, "Paper" );

        // Asking for input
        System.out.println("Hello and welcome to the Rock paper scissors the game! \nRock = 1, Scissors = 2, Paper = 3 \nGo!");
        int usernumber = scanner.nextInt();
        
        // Generates a random number:
        int compnumber = rand.nextInt(3) + 1;

        // Output:
        System.out.println( "User chose: " + map.get(usernumber) + "\nThe Computer chose: " + map.get(compnumber) );
        if (1 <= usernumber && usernumber<= 3){
            System.out.println("Wow a! " + Winner(usernumber, compnumber));
        } else {
            System.out.println("Invalid input! try again!");
        }

    }
}