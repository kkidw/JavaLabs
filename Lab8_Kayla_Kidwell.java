import java.util.Scanner;


public class Lab8_Kayla_Kidwell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int speed; //variable that stores processor speed
        int numSpeed = 0; //variable that holds the amount of processor speed
        int product = 1; //variable that holds the product of all processor speeds
        double mean; //variable that stores the mean

        System.out.print("Please enter a processor speed (-1 to end): "); //prompt user input
        speed = input.nextInt(); //assign user input to grade variable

        //use loop for sentinel value
        while (speed != -1)
        {
            product *= speed;
            numSpeed++;

            System.out.print("Please enter a processor speed (-1 to end): ");
            speed = input.nextInt();

        }

        mean = Math.pow(product, 1.0 / numSpeed);


        System.out.printf("The geometric mean for the processor speeds is %.2f", mean);






    }
}