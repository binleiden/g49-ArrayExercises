package se.lexicon;

import java.util.Arrays;

public class Exercise4 {
    //Write a program which will copy the elements of one array into another
    //array.
    //Expected output:
    //Elements from first array: 1 15 20
    //Elements from second array: 1 15 20
    public static void main(String[] args) {
        int[] numbers = {1, 15, 20};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ",");

        }
        int[] numbers2 = Arrays.copyOf(numbers, numbers.length);
        System.out.println();
        System.out.println("Copyed Array " + Arrays.toString(numbers2));
    }
}
