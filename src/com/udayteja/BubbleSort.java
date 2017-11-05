package com.udayteja;

/**
 * Created by Uday Teja on 11/5/2017.
 */
public class BubbleSort {
    public static void bubbleSort(int array[]) {
        boolean isSorted = false;
        int lastUnsorted = array.length - 1; //the largest bits keep finding their place in each loop.
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                    isSorted = false;
                }
            }
            lastUnsorted--;
        }
    }

    public static void swap(int array[], int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String r[]) {
        int a[] = {45, 2, 12, 98, 1232, 4, 19, 6, 0};
        System.out.print("Input is: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("]\n");

        bubbleSort(a);
        System.out.print("Output is: [");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print("]");
    }
}
