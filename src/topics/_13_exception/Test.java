/**
 * try block is check exception or not.
 * if exception than it will go to catch block.
 * if exception not found than it will not go to catch block.
 * "Exception" is predefined super class.
 * we know this is an Arithmetic operation than we can use "ArithmeticException" class but "Exception" class also work.
 * If we take Exception only it will take a lot of memory that's why we use different type of exception.
 * "e" is Exception referral.
 * "System.out.println(e);" is use for show what is exception name ,reason,etc.
 * in catch block we can write a statement if exception found. example- "System.out.println("can't divide by zero");"
 * int(4 byte) data type it show error but double(8 byte) is bigger size data type that's why it execute the code without error and show infinity
 * "lang" is package where different Exception store
 */

package topics._13_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("main method started");
        int a = 10, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("can't divide by zero");
        }
        System.out.println("main method ended");
        Test.divide();
    }

    static void divide() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter first number");
            double x = scanner.nextInt();
            System.out.println("Enter Second number");
            double y = scanner.nextInt();
            double z = x / y;
            System.out.println(z);
        } catch (ArithmeticException r) {
            System.out.println("error");
        } catch (InputMismatchException n) {
            System.out.println("error");
        }
    }
}


/*
 System.out.println("main method started");
 int a = 10, b = 0, c;
  c=a/b;
  System.out.println("main method ended");
 */