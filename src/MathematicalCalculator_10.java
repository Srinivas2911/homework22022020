import java.util.Scanner;

public class MathematicalCalculator_10 {
    /* 10. WAP to input any two number and ask user to enter their symbol
     (+, -, /, *) find addition, Subtraction, multiplication and division
      according to their symbol (using if else)*
     */

    public static void main(String[] args) { // main method - static
        MathematicalCalculator_10 obj = new MathematicalCalculator_10(); // object creation for instance
        obj.myCalculations();              // calling instance method to main method
    }

    public void myCalculations() {       // instance method
        Scanner scan = new Scanner(System.in);     //scanner introduced

        System.out.println("Enter the first number : "); // first number input
        double num1 = scan.nextDouble();                // value input by user

        System.out.println("Enter the mathematical operator (e.g. +,-,*, /) : "); // mathematical operation signs field
        char sign = scan.next().charAt(0);              // sign input for calculation by user.

        System.out.println("Enter the second number : "); // second number
        double num2 = scan.nextDouble();                 // value input by user

        double result;        /* defined int result for various calculations
                              can do without it, then all calculations must be
                              in the result print line */

        if (sign == '+') {                   // if mathematical operator sign for addition, equal to  (+)
            result = num1 + num2;           // result of sum operation type define for int num1 & int num2
            System.out.println("Sum of " + num1 + " and " + num2 + " = " + result);
            //printing sum result value for input numbers

        } else if (sign == '-') {           // if condition 1 is not chosen, else for sign equal to subtraction (-)
            result = num1 - num2;           // result of subtract operation defined for num1 & num2
            System.out.println("Difference of " + num1 + " and " + num2 + " = " + result);
            //printing subtraction result value for input numbers

        } else if (sign == '*') {           // else condition for  sign equal to multiplication (*)
            result = num1 * num2;           // result of multiplication value defined for num1 & num2
            System.out.println("Product of " + num1 + " and " + num2 + " = " + result);
            //printing multiplication result value for input numbers

        } else if (sign == '/') {           // else condition for  sign equal to division (-)
            result = num1 / num2;           // result of divide value defined for num1 by num2
            System.out.println("Division of " + num1 + " and " + num2 + " = " + result);
            //printing division result value for input numbers

        } else                              // else condition for all other operators used.
            System.out.println("This is not a valid operation");  // yield false result, defined as invalid operation.
    }
}