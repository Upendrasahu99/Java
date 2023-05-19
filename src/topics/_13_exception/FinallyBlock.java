package topics._13_exception;

import java.util.Scanner;

public interface FinallyBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("main method started");
        System.out.println();
        double a, b, c;

        try {
            System.out.print("Enter dividend : ");
            a = scanner.nextInt();
            System.out.print("Enter divisor : ");
            b = scanner.nextInt();
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);
            System.out.println(" divide ho gya badhai ho");
        } catch (ArithmeticException e) {
            System.out.println(" error");
            System.out.println();
            System.out.println(" 0 mat do divide nahi hoga");
        } finally {
            System.out.println();
            System.out.println("koi exception kam nahi karne par bhi finally block code nahi rukne dega  ");
        }
        System.out.println();
        System.out.println("main method ended");
    }
}
