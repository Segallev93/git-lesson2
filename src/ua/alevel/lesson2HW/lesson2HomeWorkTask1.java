package ua.alevel.lesson2HW;

/**
 * Create by Lev Sehal 04.03.2021
 */
//Task
/**
 *
 * Create a class that will report whether the integer stored in the class is even or not.
 */

public class lesson2HomeWorkTask1 {
    public static void main(String... args) {
        //numbers stored in the class
        int a = 10;
        int b = 5;
        //check if a is even or odd and print the result
        if (a%2 == 0) {
            System.out.println("this number "+ a + " is even ");
        }else {
            System.out.println("this number is " + a +" is odd ");
        }
        //check if a is even or odd and print the result
        if (b%2 == 0) {
            System.out.println("this number "+ b + " is even ");
        }else {
            System.out.println("this number is " + b +" is odd ");
        }
    }
}


