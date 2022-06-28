/**
 * Description
 *
 * @author Ayana Bando
 * @since 2022-06-24
 */
 
import java.util.Scanner;
import java.util.Random;

public class SaltPassword {
    public static void main (String[] args) {
        
      saltIt();

    }
    
    public static void saltIt() {
    
    // ========== INSERT YOUR CODE HERE ==========

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seed:");
        Random rand = new Random(sc.nextInt());
        sc.nextLine(); //move to next line for input

        System.out.println("Enter a password:");
        String password = sc.nextLine();

        char salt = (char)(rand.nextInt(58) + 65);
        char salt1 = (char)(rand.nextInt(58) + 65);
        char salt2 = (char)(rand.nextInt(58) + 'A');
        char salt3 = (char)(rand.nextInt(58) + 'A');
        char salt4 = (char)(rand.nextInt(58) + 'A');

        String saltPassword = password + salt + salt1 + salt2 + salt3 + salt4;
        //to output salt as a string store empty string in variable and add characters to empty string
        String fullSalt = "";
        fullSalt = fullSalt + salt + salt1 + salt2 + salt3 + salt4;

        System.out.println("Salt: " + fullSalt +
                "\nSalted password: " + saltPassword);
    
    
    
    // ===========================================        
    
    }
}






// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Finding the right bound and minimum value;


2. What will you always remember (never forget) from this exercise?

Review the parameters and find the simplest answer


*/