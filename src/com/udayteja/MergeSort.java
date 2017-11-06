package com.udayteja;

/**
 * Created by Uday Teja on 11/6/2017.
 */
public class MergeSort {
    public static void mergeSort(int[] array) {
        mergeSort(array, new int[array.length], 0, array.length - 1);
    }

    public static void mergeSort(int[] array, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(array, temp, leftStart, middle);
        mergeSort(array, temp, middle + 1, rightEnd);
        mergeHalves(array, temp, leftStart, rightEnd);
    }

    public static void mergeHalves(int array[], int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2; //Reconstructing the middle
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;  //Use this for the left side of the array.
        int right = rightStart; //Use this for the right side of the array.
        int index = leftStart; //Use this as the index of the temp array formed.

        while (left <= leftEnd && right <= rightEnd) {  //Walk through each half and copy the smaller elements to temp
            if (array[left] < array[right]) {
                temp[index] = array[left];
                left++; //array[left] is settled. Move to next element.
            } else {
                temp[index] = array[right];
                right++; //array[right] is settled. Move to next element.
            }
            index++; //temp[index] is settled. Move to set the next element.
        }
        /*It is possible that one of these arrays go out of bounds. The remainder of the other array should be
         temp too */

        //We can either write a for loop that copies over the data (Or) use System.arraycopy and specify the boundaries.

        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        //Start copying array into temp(i.e., from array[left] to temp[left] for (leftEnd - left + 1) elements
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        //Only one of the arraycopy methods will have an effect. The other will just copy 0 elements.

        //Now copy everything from temp to array
        System.arraycopy(temp, leftStart, array, leftStart, size);
    }

    public static void main(String arg[]) {
        int[] array = {2323, 12, 5, 64, 123, 9, 87, 56, 9, 0};
        System.out.print("Input is: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]\n");

        mergeSort(array);
        System.out.print("Output is: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("]");
    }
}
