package se.lexicon;

import java.util.Scanner;

public class Exercise11 {
    /*Write a program that ask the user for an integer and repeat that
    question until user give you a specific value that user already has been
    told about as a message in your program. Store these values in an array
    and print that array. After that reverse the array elements so that the
    first element becomes the last element, the second element becomes
    the second to last element, etc. Do not just reverse the order in which
    they are printed. You need to change the way they are stored in the
    array.*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the limit of the array: ");
        int limit = scanner.nextInt();
        int[] arr = new int[limit];
        for (int i = 0; i < limit; i++) {
            System.out.printf("Enter element at index %d: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("\nDisplay array elements " +
                "in reverse order...\n");
        for (int i = limit - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}
