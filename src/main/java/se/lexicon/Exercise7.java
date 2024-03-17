package se.lexicon;

public class Exercise7 {
    public static void main(String[] args) {
        //Write a program which will set up an array to hold 10 numbers and print
        //out only the uneven numbers.
        //Expected output:
        //Array: 1 2 4 7 9 12
        //Odd Array: 1 7 9
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) { //checking if the remainder of dividing i by 2 is not equal to 0. 2 == 0 would return even numbers.
                System.out.print(i + " ");
            }
        }
    }
}
