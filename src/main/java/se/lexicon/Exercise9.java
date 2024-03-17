package se.lexicon;

import java.util.Arrays;
import java.util.concurrent.LinkedTransferQueue;

public class Exercise9 {
    public static void main(String[] args) {
        //create array
        //create new int to add to array
        //create a new array with length of old array +1
        //copy old array to new
        //add new int to last postion of new array

        int[] array = {1, 2, 3, 4, 5};
        int integer = 6;
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = integer;
        array = newArray;
        System.out.println(Arrays.toString(array));
    }

}


