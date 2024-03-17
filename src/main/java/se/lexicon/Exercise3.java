package se.lexicon;

import java.util.Arrays;

public class Exercise3 {
    //Write a program which will sort string array.
    //Expected output: String array: [Paris, London, New York, Stockholm]
    //Sort string array: [London, New York, Paris, Stockholm]
    public static void main(String[] args) {
        String[] city = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(city, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(city));
    }
}
