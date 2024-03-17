package se.lexicon;

import java.util.Arrays;

public class Exercise5 {
    public static void main(String[] args) {
        //Create a two-dimensional string array [2][2]. Assign values to the
        //2-dimentional array containing any Country and City.
        //Expected output:
        //France Paris
        //Sweden Stockholm
        String[][] countryCity;
        countryCity = new String[2][2];
        countryCity[0][0] = "France";
        countryCity[0][1] = "Paris";
        countryCity[1][0] = "Sweden";
        countryCity[1][1] = "Stockholm";

        //Example of printing out a two dimensional int array
        for (int i = 0; i < countryCity.length; i++) {
            for (int j = 0; j < countryCity[i].length; j++) {
                System.out.print(countryCity[i][j]+ " ");
                //Blankline when index of subarray is at last element
                if (j == countryCity[i].length - 1) {
                    System.out.println();
                }
            }
        }
    }
}