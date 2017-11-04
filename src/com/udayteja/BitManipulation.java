package com.udayteja;

/**
 * Created by Uday Teja on 11/4/2017.
 */
public class BitManipulation {
    public static void main(String args[]){
        byte a = 0; //00000000
        //COMPLEMENTING(~)*****************************************************************
        System.out.println("Complement of " + a + " is " + ~(a));
        byte b = 49;
        System.out.println("Complement of " + b + " is " + ~(b));
        /*Inverse of 0 is -1 because 11111111 is 2's complement form of -1.
        If the Sign Bit is 1, it is assumed as a 2's complement form.
        So to evaluate what 11111111 is, remove the 1 from as we know it is a negative number.
        Invert the remaining numbers add 1. 0000000+1 = 1. So our number is -1.
        If input is 00110001(49), output is 11001110 (-50) because 0110001 + 1 = 50;
        */

        //SIGNED LEFT SHIFT(<<)*******************************************************
        byte x1 = 23, output;
        for(byte i = 0; i < 4; i++){
           //Java by default returns an integer for bitshift.
            System.out.println("Left shifting " + x1 + " by "+ i +" bit :" + (x1 << i));
        }
        System.out.println("Left Bit shifting the maximum Integer value: " + Integer.MAX_VALUE + " becomes " + (Integer.MAX_VALUE << 1));
    }
}
