package Homework01;

public class PracticeVariables {
    public static void main(String[] args) {
        // Declare and initialize variables for each primitive data type
        boolean myBoolean = true;
        byte myByte = 127;
        short myShort = 32767;
        int myInt = 2147483647;
        long myLong = 9221372036855775807L;
        float myFloat = 3.3f;
        double myDouble = 10.8765;
        char myChar = 'N';

        // Print the value of each variable
        /*Note that in Java, the long data type requires an L suffix to
        indicate that a number is a long, and the float data type requires
        an f suffix to indicate that a number is a float. Additionally,
        the char data type is used to represent a single character,
        and the boolean data type can have one of two values: true or false.*/

        System.out.println("MyBoolean   : " + myBoolean);
        System.out.println("MyByte      : " + myByte);
        System.out.println("MyShort     : " + myShort);
        System.out.println("MyInt       : " + myInt);
        System.out.println("MyLong      : " + myLong);
        System.out.println("MyFloat     : " + myFloat);
        System.out.println("MyDouble    : " + myDouble);
        System.out.println("MyChar      : " + myChar);



    }
}
