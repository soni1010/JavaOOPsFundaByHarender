package org.harender.arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class CheckIfArrayIsSorted {

    public static void main(String[] args) {




    }




        // In this program, We will check if the given array is in sorted order
//        int[] array1 = { 20, 19, 1, 11, 4, 3 };
//        int[] array2 = { 1, 2, 3, 4, 5 };
//        System.out.println("array1 is "+checkArrayOrder(array1));
//        System.out.println("array2 is "+checkArrayOrder(array2));



    public static String checkArrayOrder(int[] array) {
        boolean ascending = true;
        boolean descending = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] >= array[i + 1] && descending)
                ascending = false;
            if (array[i] <= array[i + 1] && ascending)
                descending = false;
        }

        if (ascending)
            return "Ascending";
        else if (descending)
            return "Descending";
        else
            return "Unsorted";
    }


}
