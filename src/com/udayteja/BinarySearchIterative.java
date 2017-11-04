package com.udayteja;

public class BinarySearchIterative {
    public static boolean binarySearchIterative(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (x == array[mid]) {
                return true;
            } else if (x <= array[mid]) {  //Everything to the right of array[mid] is now waste
                right = mid - 1;
            } else { //Everything to the left of array[mid] is now waste
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int array[] = {12, 23, 45, 678, 234234, 8239124, 80001083};
        System.out.println(binarySearchIterative(array, 204234));
    }
}
