package roman_marcov;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class NumbersMain {
    public static void main(String[] args) {
  /*
        Numbers:
1. Find the square root of a number.
2. Generate a random number between 0 and 100. (Try the same between 10 and 100)
3. Check if a number is prime.
4. Calculate the average of three numbers.
5. Find the maximum of 4 numbers.
  */
    //#1
       /* Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        double r = Math.sqrt(x);
        System.out.println("The square root of " + x + " is " + r);
    */
    //#2
        /*Random num = new Random();
        int low = 10;
        int high = 100;
        int result = num.nextInt(high-low) + low;
        System.out.println("Random number is: " + result);
        */
    //#3
    /*    Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int k = scan.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < k; i++) {
            if (k % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Number " + k + " is prime");
        } else {
            System.out.println("Number " + k + " is NOT prime");
        }*/

    //#4
        System.out.println("Enter 3 numbers: ");
        Scanner input = new Scanner (System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00##");
        int num1;
        int num2;
        int num3;
        double avg;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        avg = (double)(num1 + num2 + num3) / 3.0;
        System.out.println("The average is: " + decimalFormat.format(avg));
    }
}
