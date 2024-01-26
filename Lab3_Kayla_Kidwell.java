//Calculate the volume and surface area of a cube

import java.util.Scanner;
import java.lang.Math;


public class Lab3_Kayla_Kidwell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declare scanner object

        System.out.print("Please enter the initial value of the home: "); //Prompt user to input initial home value
        double InitialValue = input.nextDouble();

        System.out.print("Please enter the number of elapsed years: "); //Prompt user to input number of elapsed years
        double ElapsedYears = input.nextDouble();

        System.out.print("Please enter the interest rate: "); //Prompt user to input the interest rate
        double InterestRate = input.nextDouble();

        InterestRate = InterestRate / 100; //Converting the interest to a percentage

        double FinalValue = InitialValue * Math.pow(1+ InterestRate, ElapsedYears); //Calculate the final value of the home

        System.out.println("The final value of the home is $" + FinalValue); //Display the final value of the home


    }
}