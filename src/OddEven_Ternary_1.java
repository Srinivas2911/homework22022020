import java.util.Scanner;

public class OddEven_Ternary_1 {
/* 1. Write a java program that tell us that Input number is odd or even?
HINT: use turnery operator (? :)
*/

    public static void main(String[] args) { // main method

        Scanner scan = new Scanner(System.in);  // scanner introduced
        System.out.println(" Enter a number : ");  // input print
        int a = scan.nextInt();                 // integer a fro user input

        String result;        //a String is defined as "result" for Odd or Even
        result = (a % 2 == 0) ? "Even" : "Odd";  // ternary operator (? :)
        System.out.println("This number is " + result); // print statement
    }
}

