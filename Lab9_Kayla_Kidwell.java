import java.lang.Math;

public class Lab9_Kayla_Kidwell {
    public static void main(String[] args) {
        int faceOne = 0; //variable to keep track if a one is rolled
        int faceTwo = 0; //variable to keep track if a two is rolled
        int faceThree = 0; //variable to keep track if a three is rolled
        int faceFour = 0; //variable to keep track if a four is rolled
        int faceFive = 0; //variable to keep track if a five is rolled
        int faceSix = 0; //variable to keep track if a six is rolled

        int totalRolls = 0; //variable to hold total rolls

        for (int count = 0; count < 10000; count++) {
            int diceRolls = (int) (Math.random() * 2); //random number generated for dice rolls

            if (totalRolls == 1 || diceRolls == 1) { //dice rolls generated
                faceOne++;
                faceTwo++;
                faceThree++;
                faceFour++;
                faceFive++;
                faceSix++;


            } else {
                diceRolls++;
            }

        }


//results printed to the console
            System.out.println("The total amount of ones rolled is " + faceOne + " ");
            System.out.println("The total amount of twos rolled is " + faceTwo + " ");
            System.out.println("The total amount of threes rolled is " + faceThree + " ");
            System.out.println("The total amount of fours rolled is " + faceFour + " ");
            System.out.println("The total amount of fives rolled is " + faceFive + " ");
            System.out.println("The total amount of sixes rolled is " + faceSix + " ");

            System.out.printf("The probability of rolling a one is %.2f%%.%n ", (double) totalRolls / faceOne * 100);
            System.out.printf("The probability of rolling a one is %.2f%%.%n ", (double) totalRolls / faceTwo * 100);
            System.out.printf("The probability of rolling a one is %.2f%%.%n ", (double) totalRolls / faceThree * 100);
            System.out.printf("The probability of rolling a one is %.2f%%.%n ", (double) totalRolls / faceFour * 100);
            System.out.printf("The probability of rolling a one is %.2f%%.%n ", (double) totalRolls / faceFive * 100);
            System.out.printf("The probability of rolling a one is %.2f%%.%n ", (double) totalRolls / faceSix * 100);


        }


    }
