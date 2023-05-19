//Taking input from user for float data type
package topics._03_data_type;

import java.util.Scanner;

public class UserInput_02  {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Number");
        float a=scanner.nextFloat();
        System.out.println("Enter second Number");
        float b= scanner.nextFloat();
        float sum=a+b;
        System.out.println("Sum of The number First and Second:");
        System.out.println(sum);

    }
}
