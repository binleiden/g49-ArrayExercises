package se.lexicon;

import java.util.Arrays;
import java.util.Random;

public class Exercise13 {
    /*Create two arrays with arbitrary size and fill one with random numbers.
Then copy over the numbers from the array with random numbers so
that the even numbers are located in the rear (the right side) part of the
array and the odd numbers are located in the front part (the left side).*/
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6};
        originalArray = generateRandomNumber(originalArray.length);
        int[] modifiedArray = Arrays.copyOf(originalArray, originalArray.length);

        System.out.println("Array with random numbers" + Arrays.toString(originalArray));

        int frontIndex = 0;
        int rearIndex = modifiedArray.length - 1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] % 2 == 0) {
                modifiedArray[rearIndex] = originalArray[i];
                rearIndex--;
            } else {
                modifiedArray[frontIndex] = originalArray[i];
                frontIndex++;
            }
        }
        System.out.println("Sorted array with even numbers to the right. and od numbers to the left: " + Arrays.toString(modifiedArray));
    }

    public static int[] generateRandomNumber(int length) {
        Random random = new Random();
        int[] randomNumbers = new int[length];
        for (int i = 0; i < length; i++) {
            randomNumbers[i] = random.nextInt(100);
        }
        return randomNumbers;
    }

}
