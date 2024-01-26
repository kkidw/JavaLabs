import java.util.Scanner;

// Energy= mass * speed of light^2
public class Lab2_Kayla_Kidwell {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declaring variable for input
        double mass; //declaring mass variable
        double speed_of_light; //declaring speed of light variable
        double energy; //declaring energy variable

        System.out.print("Please enter the mass of the object (kg):"); //prompt user
        // obtaining user input as double variable for mass
        mass = input.nextDouble();

        System.out.print("Please enter the speed of light"); //prompt user
        // obtaining user input as double variable for speed of light
        speed_of_light = input.nextDouble();


        energy = mass * speed_of_light; //apply energy equation with variable

        System.out.println("The force applies to the object is " + energy + "N.");
    }
}
