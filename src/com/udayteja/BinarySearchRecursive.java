package com.udayteja;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by Uday Teja on 11/4/2017.
 */
public class BinarySearchRecursive {
    public static boolean binarySearchRecursive(int[] array, int x, int left, int right){
       if(left > right) {
           return false;   //Can't find it
       }

       int mid = (left + right) / 2; // Or use left + (right - left) / 2;  to avoid overflow.
        if (x == array[mid]) {
            return true;
        } else if(x <= array[mid]){
            return binarySearchRecursive(array, x, left, mid - 1);
        } else {
            return binarySearchRecursive(array, x, mid + 1, right);
        }
    }

    public static boolean binarySearchRecursive(int[] array, int x){
        return binarySearchRecursive(array, x, 0, array.length-1 );
    }

    public static void main(String args[]){
        int array[] = {3, 12, 23, 43, 833, 888, 1024, 8483, 9000};
        System.out.println(binarySearchRecursive(array, 9000));
    }
}
