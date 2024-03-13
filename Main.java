
import java.util.regex.Pattern;
import java.util.*;
import java.lang.*;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //declaring scanner to accept input from the user

        String username; //declaring string variables for both username and password
        String password;

        try { //try-catch block method for username and password to validate them or throw an error
            System.out.print("Please enter your username: ");
            username = sc.nextLine();

            System.out.print("Please enter your password: ");
            password = sc.nextLine();

            validateUsername(username);
            validatePassword(password);

            System.out.println("Successfully signed up.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

public static void validateUsername(String username) { //declaring requirements for username
    String usernameRegex = ".*@.*\\.com";

    Pattern p = Pattern.compile(usernameRegex);
    if(!p.matcher(username).matches());

    throw new IllegalArgumentException("Invalid Username");
}
       public static void validatePassword(String password){ //declaring requirements for password

    boolean hasUpperCase = false;
    boolean hasLowerCase = false;
    boolean hasDigit = false;
    boolean hasSpecialCharacter = false;

    for(int i = 0; i < password.length(); i++){ //if-else statement for password requirements
        if(Character.isUpperCase(password.charAt(i))){
            hasUpperCase = true;
        }
        else if(Character.isLowerCase(password.charAt(i))){
            hasLowerCase = true;
        }
        else{
            hasSpecialCharacter = true;

        }
    }
    if(!hasUpperCase) { //if-else statement to throw errors if requirements aren't met
        throw new IllegalArgumentException("Password must contain an uppercase letter.");
    }
    if(!hasLowerCase){
        throw new IllegalArgumentException("Password must contain a lowercase letter.");
    }
           if (!hasDigit) {
               throw new IllegalArgumentException("Password must contain a digit.");
           }
           if(!hasSpecialCharacter){
               throw new IllegalArgumentException("Password must contain a special character.");

           }
       }



