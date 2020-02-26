public class NumbersDivisibleby3And5_11 {

    // 11. WAP to print the numbers between 1 to 100 which can be divided by 3 and 5 separately.

    public static void main(String[] args) {  // main method


        System.out.println("Numbers divisible by 3 : "); // print statement
        for (int a = 1; a < 100; a++) {    // int a defined for numbers a=1, and a <100
            if (a % 3 == 0)                 // for loop used,  a++=value increases by 1
                // a% 3 gives remainder 0.
                System.out.print(a + ",");  // then print a in loop.
        }

        System.out.println("Numbers divisible by 5 : "); // print statement
        for (int b = 1; b < 100; b++) {     // int b 1-100 in for loop
            if (b % 5 == 0)                 // if b / 5 gives remainder 0,
                System.out.print(+b + ","); // then print b value in loop
        }
    }
}
