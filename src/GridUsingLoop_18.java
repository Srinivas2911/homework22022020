import java.util.Scanner;

public class GridUsingLoop_18 {

// 18. Write a Java program to print the following grid with 10 line using for loop.

        public static void main(String[] args) {  // main method

        gridLoop();                               // static method called directly
    }
    public static void gridLoop() {               // static method

        Scanner scan = new Scanner(System.in);    // Scanner introduced
        int i = 0;                                // int i defined for no. of loops
        System.out.println("Enter a Character : ");   // Input field
        String a = scan.next();                    // String for user input

        while (i < 10) {                            // while condition for loop
            System.out.println(a+a+a+a+a+a+a+a+a+a+a+a+a+a);  // body to be printed in loop
            i++;                                       // loop increase by value 1 until i=10 (ten times)
        }
    }
}