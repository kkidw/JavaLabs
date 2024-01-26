// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Lab6_Kayla_Kidwell {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Declare scanner object

        double median; // Declare variable for the median
        int size;     // Declare a variable for the size of the range
        int shiftAmount; // Declare a variable for the shift amount
        int randomNumber; // Declare a variable for the randomly generated number

        // Prompt the user to input the median of the range
        System.out.print("Please enter the median for this random range: ");
        median = scanner.nextDouble(); // Get user's input for the median

        // Prompt the user to input the size of the range
        System.out.print("Please enter the size of this random range: ");
        size = scanner.nextInt(); // Get user's input for the size of the range

        // Calculate the shift amount of the randomly generated range
        if (size % 2 == 0) {
            shiftAmount = size / 2;
        } else {
            shiftAmount = (size - 1) / 2;
        }

        // Calculate the final randomly generated number
        randomNumber = (int) (Math.random() * size) + (int) (median - shiftAmount);

        // Print the randomly generated number
        System.out.println("The random number is: " + randomNumber);

        scanner.close(); // Close the Scanner to release system resources
    }
}