package se.lexicon;

public class Exercise12 {
    /*Write a program which will print the diagonal elements of two-
    dimensional array.
    Expected output:
    149*/
    public static void main(String[] args) {
        printDiagonalNumbers();
    }

    public static void printDiagonalNumbers() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i][i] + " ");
        }
    }

    public static void storeDiagonalNumbers() {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] diagonalElements = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            diagonalElements[i] = numbers[i][i];
        }

        for (int element : diagonalElements) {
            System.out.println(element);

        }
    }

}

