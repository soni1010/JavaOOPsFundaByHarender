package org.harender.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class DeclarationOfArraysInJava {

    public static void main(String[] args) {
        //OneDimsArray();
        //data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]….[sizeN];
        //TwoDimsArray();
        nDimsArray();
    }

    public static void OneDimsArray() {
        //1D (One Dimensional) Array in java and there declaration
        // integer type array declare only , not initialized
        int[] a;
        // b is array & it's of type int declare only , not initialized
        int b[];
        // c is array & it's of type int, d will be considered as a variable declare only , both are not initialized
        int c[], d;
        // here all are arrays because we used int[] now can be n numbers of array using this.
        int[] e, f = new int[2];
        f = new int[10];
        System.out.println(f.length);
        e = new int[]{2, 1, 2, 1, 4, 3, 2, 3, 2};
        System.out.println(Arrays.stream(e).max().getAsInt());
        System.out.println(Arrays.stream(e).sum());
        System.out.println(Arrays.stream(e).allMatch(n -> n % 2 == 0));
        System.out.println(Arrays.stream(e).anyMatch(n -> n % 2 == 0));
        System.out.println(Arrays.stream(e).sorted().findFirst().getAsInt());
        c = Arrays.stream(e).sorted().toArray();
        System.out.println(Arrays.toString(c));
    }

    public static void TwoDimsArray(){
        int[][] a;
        // wrong int a[][];
        int[][] b,c={{2,2,2}};
        a=new int[][]{{1,2,3,2,1,4,5},{2,4,5,4,2,3},{2,4,5,4,2,3}};

        System.out.println(c.length);
        System.out.println(a.length);
        System.out.println("Length of first row= "+a[0].length+" and second row= " +a[1].length);
        int length=Arrays.stream(Arrays.stream(a).limit(1).toArray()).toArray().length;
        System.out.println(length);
    }

    public static void nDimsArray(){
        int[][][][] fourDArray;
        fourDArray=new int[][][][]{{
            {{1,1,1,1}},{{2,2,2,2}}}};
        System.out.print(fourDArray[0][1][0][3]);

    }
}
