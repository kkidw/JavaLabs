
import java.util.Random;


public class Lab12_Kayla_Kidwell {
    public static void main(String[] args) {
        //make call to rollDice method and assign result to array
        //pass array above to sortResults() and assign another array

        //for loop that processes the array

        int[] diceRolls = rollDice(); //call rollDice method
        int[] sortedResults = sortResults(diceRolls); //call sortResults method

        //print the results to the console
        for (int i = 0; i < diceRolls.length; i++) {
            double probability = (double) diceRolls[i] / 1000 * 100;
            System.out.printf("The probability of rolling a %d is approximately %.2f%%.\n", sortedResults[i], probability);
        }
    }

    // The rollDice method
    public static int[] rollDice() {
        int[] results = new int[11]; // Array to hold dice roll results

        //create for loop with 10,000 iterations
        //secondDie 1-6
        //rollResult = variable holds the sum of the two die results
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            int dice1 = rand.nextInt(6) + 1;
            int dice2 = rand.nextInt(6) + 1;
            int sum = dice1 + dice2;

            results[sum - 2]++;
        }

        return results;
    }

    //Bubble sort for results and dice
    public static int[] sortResults(int[] results) {
        int[] rolls = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        for (int step = 0; step < rolls.length - 1; step++)

            for (int index = 0; index < rolls.length - step - 1; index++) //does actual comparison with adjacent element and swaps if needed
            {
                if (rolls[index] > rolls[index + 1]) {
                    int temp = rolls[index];
                    rolls[index] = rolls[index + 1];
                    rolls[index + 1] = temp;

                    temp = rolls[index];
                    rolls[index] = rolls[index + 1];
                    rolls[index + 1] = temp;


                }
            }
        return rolls;
    }


    }






