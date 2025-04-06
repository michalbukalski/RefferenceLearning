package dev.michal;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;


        System.out.println("myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray,1,2);
        modifyArray(anotherArray,2,3);
        modifyArray(myIntArray,3,4);

        System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
        System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));

    }

    private static void modifyArray(int[] array, int a, int b){
        array[a]=b;
    }
}
