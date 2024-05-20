package org.harender.algorithms;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.Stream;

public class PlayWithSort {



    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        BuiltInSortingAlgorithms(numbers);
    }

    public static void BuiltInSortingAlgorithms(int[] inputArray){
        System.out.println(Arrays.toString(inputArray));
        Arrays.sort(inputArray);
        Arrays.stream(inputArray,3,6);
        System.out.println(Arrays.toString(inputArray));
        System.out.println(Arrays.stream(inputArray).max());
        System.out.println(Arrays.toString(inputArray));
    }

    public static void BuiltInSortingAlgorithms(){

    }

}
