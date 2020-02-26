import java.util.Scanner;

public class AverageValueOfArray_19 {

    //19. Write a Java program to calculate the average value of array elements.

    public static void main(String[] args) {
        myArrayAverage();

    }

    public static void myArrayAverage() {

        double sum = 0;                        // double sum defined as we aare working on average
        Scanner scan = new Scanner(System.in);  // scanner introduced/
        System.out.print("Size of the array /No. of items :");  // print statement for no. of items
        int x = scan.nextInt();               // int 'x' defined. for user input for no. of items.

        double numArrays[] = new double[x];      // numArrays defined as double for average.
                                                 // for new double with array paramater 'x' no of items

        System.out.println("Enter the elements one by one:"); // print statement for the elements to be input
        for (int i = 0; i < numArrays.length; i++) {      // for loop condition. with index at 0
            numArrays[i] = scan.nextDouble();    // User input for all the array items one by one.
        }
        for (int y = 0; y < numArrays.length; y++) {
            sum = sum + numArrays[y];                    // results in the sum of all the array items
        }
        double average = sum / x;

        System.out.println("Sum of the Arrays :" + sum);
        System.out.println("Average of the Arrays : " + average);
    }
}
