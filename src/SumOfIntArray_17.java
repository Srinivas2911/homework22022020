import java.util.Arrays;

public class SumOfIntArray_17 {

    //17. Write a Java program to sum values of an array.

    public static void main(String[] args) {

        int[] array = new int[]{20, 30, 40, 50, 60,};
        //calculate sum of all array elements
        int sum = 0;
        for(int i=0; i < array.length ; i++)
            sum = sum + array[i];
        System.out.println("Sum of the Array = " +sum);
        //calculate average value
        System.out.println("Length of array = "+array.length);
        double average = sum / array.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}