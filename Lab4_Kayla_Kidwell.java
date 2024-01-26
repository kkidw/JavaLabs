//importing scanner
import java.util.Scanner;

import static java.lang.System.out;

public class Lab4_Kayla_Kidwell {
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   double mealCost; //declare variable for cost
      int tip; //declare variable for tip
      final double salesTax = 0.0825; //declare variable for sales tax

      System.out.print("Please enter the initial cost of the meal: "); //prompt user for meal cost
      mealCost = input.nextDouble(); //user input for variable
      mealCost *= (1 + salesTax); //calculate total cost with tax

      System.out.print("Please enter your choice for the tip (1 = 10%, 2 = 15%, 3 = 20%): "); //prompt user for choice of tip
      tip = input.nextInt(); //declare tip variable

      //Calculating tip with variables assigned
      if (tip == 1) {
          mealCost *= 1.10;
      }
      else if (tip == 2) {
          mealCost *= 1.15;
      }
      else if (tip == 3) {
          mealCost *= 1.20;
      }

      mealCost = (int) (mealCost * 100 + 0.5) / 100.0; //case operator
      System.out.print("The final cost of the meal is $" + mealCost); //display total cost of meal

      }



    }
