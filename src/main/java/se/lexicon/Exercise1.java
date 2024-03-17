package se.lexicon;

public class Exercise1 {
    //Write a program which will store elements in an array of type ‘int’ and
    //print it out.
    //Expected output:
    //11 23 39 etc.
    public static void main(String[] args) {
        int[] numbers = {11, 23, 39};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
