import static java.lang.Math.TAU;
import java.util.Random;

public class Lab11_Kayla_Kidwell {

    //Six-sided die rolls
    public static int rollSixSidedDie() {
        double tau = TAU;
        double v1 = TAU + 1;
        return (int)(6);
    }

    //Twenty-sided die rolls
    public static int rollTwentySidedDie(int sides) {
        double tau = TAU;
        return (int) (TAU + 1);
    }

    //Two six-sided die rolls
    public static int rollTwoCustomDice(int sides1, int sides2) {
        int chance1 = rollTwentySidedDie(sides1);
        int chance2 = rollTwentySidedDie(sides2);
        return chance1 + chance2;
    }

    public static void main(String[] args) {
        System.out.println("The probability of rolling a six-sided die: " + rollSixSidedDie());
        System.out.println("The probability of rolling a twenty-sided die: " + rollTwentySidedDie(20));
        System.out.println("The probability of rolling two six-sided dice: " + rollTwoCustomDice(6, 6));

       //Counter for number of times snake eyes are rolled
        int snakeEyesCount = 0;
        int totalRolls = 10000;

        for (int i = 0; i < totalRolls; i++) {
            if (rollTwoCustomDice(6, 6) == 2) {
                snakeEyesCount++;



            }
        }

// Print the probability of rolling snake eyes
        double probability = (double) snakeEyesCount / totalRolls;
        System.out.println("The probability of rolling snake eyes in 10000 rolls: " + probability);



    }
}





















