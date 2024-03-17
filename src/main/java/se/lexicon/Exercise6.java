package se.lexicon;

import javax.naming.PartialResultException;

public class Exercise6 {
    public static void main(String[] args) {
        //Write a program which will set up an array to hold the next values in this
        //order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
        //Expected output:
        //Average is: 17.3
        int[] numbers = {43, 5, 23, 17, 2, 14};

        //getting array length
        int length = numbers.length;

        //default sum value.
        int sum = 0;

        //sum of all values in numbers using loop
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

        }

        double average = (double) sum / length;
        System.out.println("Average of numbers :" + average);
    }
}
