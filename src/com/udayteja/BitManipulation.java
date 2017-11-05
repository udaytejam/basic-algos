package com.udayteja;

public class BitManipulation {
    public static void main(String args[]) {
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

        //SIGNED LEFT SHIFT(<<)************************************************************
        //It doubles the number with each shift
        byte x1 = 23, x2 = -18;
        for (byte i = 0; i < 4; i++) {
            //Java by default returns an integer for bit shift
            System.out.println("Left shifting " + x1 + " by " + i + " bits :" + (x1 << i));
        }

        System.out.println("Left Bit shifting the maximum Integer value: " + Integer.MAX_VALUE + " becomes " + (Integer.MAX_VALUE << 1));

        for (byte i = 0; i < 4; i++) {
            //Java by default returns an integer for bit shift
            System.out.println("Left shifting " + x2 + " by " + i + " bits :" + (x2 << i));
        }

        //SIGNED RIGHT SHIFT(>>)**********************************************************
        //It halves the number with each shift
        for (byte i = 0; i < 8; i++) {
            //Java by default returns an integer for bit shift
            System.out.println("Right shifting " + x1 + " by " + i + " bit :" + (x1 >> i));
        }
        //Let's Right Shift a negative number. Same halving happens, but 1 get's added if it is odd(Rounded up)
        for (byte i = 0; i < 8; i++) {
            //Java by default returns an integer for bit shift
            System.out.println("Right shifting " + x2 + " by " + i + " bit :" + (x2 >> i));
        }

        /*This is also called Logical shifting. Which may create negative numbers. You may not observe doubling/halving
        when you are shifting Integer.MAX_VALUE because there's no condition for Sign bit to retain it's value. It will
        be considered just as any normal bit. There's an another type of shifting called 'Arithmetic shifting' which will
        retain the Sign Bit and shift other numbers.
        */
        //Arithmetic shifting

        //UNSIGNED RIGHT SHIFT(>>>)*******************************************************
        for (byte i = 0; i < 8; i++) {
            //Java by default returns an integer for bit shift
            System.out.println("Unsigned Right shifting " + x2 + " by " + i + " bit :" + (x2 >>> i));
        }

        //There is NO 'Signed left shift' because it wouldn't make sense to ignore the MSB beside the Sign bit.
        //////OTHER BIT OPERATIONS(&, |, ^)-----------------------------------------------

        //Getting 4th bit of 44(101100), for example. We need to use "&" operator
        System.out.println("The 5th bit of 44 is: " + ((44 & (1 << 4)) > 0));
        //You shift n-1 bits to the left to get nth bit

        //Setting the 4th bit of 44. 44(101100) becomes (111100). We need to use '|' operator
        System.out.println("Setting 5th bit of 44 to 1: 44 becomes " + (44 | (1 << 4)));

        //Clearing the 3rd bit of 44. Result = 101000. We need to '&' the number with ~(1 << (n-1))
        System.out.println("Clearing the 3rd bit of 44: 44 becomes " + (44 & ~(1 << 3)));
    }
}
