// Taking user input for int data type
package topics._03_data_type;
import java.util.Scanner;// package imported for make scanner class

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);//making package of scannner class
        System.out.println("Enter number 1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum=a+b;
        System.out.println("Sum of number 1 and 2 :");
        System.out.println(sum);

    }



}
