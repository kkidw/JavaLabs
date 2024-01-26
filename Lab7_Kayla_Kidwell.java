import java.util.Scanner;


public class Lab7_Kayla_Kidwell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String city1, city2, city3; //Declare two variable of string type
        boolean city1_one, city2_one, city3_one;

        System.out.print("Please enter the first city: "); //Prompt user for input
        city1 = input.nextLine(); //Assign user input to city1

        System.out.print("Please enter the second city: "); //Prompt user for input
        city2 = input.nextLine(); //Assign user input to city2

        System.out.print("Please enter the third city: "); //Prompt user for input
        city3 = input.nextLine(); //Assign user input to city3


        //Order to print cities in alpha order
        city1_one = city1.compareToIgnoreCase(city2) <= 0
                && city1.compareToIgnoreCase(city3) <= 0;
        city2_one = city2.compareToIgnoreCase(city1) < 0
                && city2.compareToIgnoreCase(city3) <= 0;
        city3_one = city3.compareToIgnoreCase(city1) < 0
                && city3.compareToIgnoreCase(city2) < 0;




        //Print cities in alpha order
        if (city1_one) {
            System.out.println(city1);
            if (city2_one) {
                System.out.println(city2);
                System.out.println(city3);
            } else {
                System.out.println(city3);
                System.out.println(city2);
            }
        } else if (city2_one) {
            System.out.println(city2);
            if (city3_one) {
                System.out.println(city3);
                System.out.println(city1);
            } else {
                System.out.println(city1);
                System.out.println(city3);
            }
        } else {
            System.out.println(city1);
            System.out.println(city2);
            System.out.println(city3);
//Print results to console

            System.out.print(city1);
            System.out.print(city2);
            System.out.print(city3);

        }
    }
}







