//Import scanner
import java.util.Scanner;

public class Lab5_Kayla_Kidwell {
    public static void main(String[] args) {

        //Declare scanner object to accept input
        Scanner scanner = new Scanner(System.in);

        //Declare variables for input
        int userInput, quotient, remainder;
        String mostSigDigit, leastSigDigit;

        //Prompting user to enter amount of red
        System.out.print("Enter the amount of red (0-255): ");
        userInput = scanner.nextInt();

        //Verify input is valid
        if (userInput >= 0 && userInput <= 255) {
            quotient = userInput / 16;
            remainder = userInput % 16;

            //Convert quotient and remainder to hexadecimal digits
            mostSigDigit = convertToHexDigit(quotient);
            leastSigDigit = convertToHexDigit(remainder);

            //Printing results
            System.out.println("The hexadecimal color code for " + userInput + " is #" + mostSigDigit + leastSigDigit + "0000");
        } else {
            System.out.println("Invalid Input. Please enter a number between 0 and 255.");
        }
    }
    //Method to convert integers to hexadecimal digits
    private static String convertToHexDigit(int num){
        if (num < 10) {
            return Integer.toString(num);
        } else {
            char c = (char) ('A' + (num - 10));
        return Character.toString(c);
        }
    }
}