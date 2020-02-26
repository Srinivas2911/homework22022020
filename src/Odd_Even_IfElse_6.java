import java.util.Scanner;

public class Odd_Even_IfElse_6 {  // class name

    /*
    6. WAP to input any number and find out if it’s odd or even
    */
    public static void main(String[] args) {  // main method

        Scanner scan = new Scanner(System.in); // scanner introduced
        System.out.println(" Enter a number : "); // print statement number
        int a = scan.nextInt();    // int a is now defined in scanner.

        if (a % 2 == 0) {      // even condition if "a" is divisible by 2 then even.
            System.out.println(a+ " = This number in Even"); //print even statement

        } else {                                       // else, "a" is odd.
            System.out.println(a+ " = This number is Odd"); // printing odd statement
        }
    }
}
