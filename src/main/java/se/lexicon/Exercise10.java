package se.lexicon;

public class Exercise10 {
    public static void main(String[] args) {
        //Write a program which will represent multiplication table stored in
        //multidimensional array.
        //Hint: You have two-dimensional array with values
        //[[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
        int[][] multiplicationTable = new int[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiplicationTable[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(multiplicationTable[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
