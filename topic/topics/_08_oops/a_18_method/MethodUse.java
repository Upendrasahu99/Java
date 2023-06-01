//Make different method for different type of work so other programmer understand our program easily

package topics._08_oops.a_18_method;

import java.util.Scanner;

public class MethodUse {
    int n1,n2,add,sub,multi,div;//instance variable

    public static void main(String[] args) {
        MethodUse m = new MethodUse();
        m.input();
        m.process();
        m.output();
    }
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers:");
         n1= scanner.nextInt();//We can call directly instance variable in instance method(nonstatic method)
         n2= scanner.nextInt();
    }
    void process(){
        add =n1+n2; //We can use data of nonstatic method directly in nonstatic method
        sub =n1-n2;
        multi=n1*n2;
        div=n1/n2;
    }
    void output(){
        System.out.println("add " +add);
        System.out.println("subtraction " +sub);
        System.out.println("multiplication " +multi);
        System.out.println("division " +div);

    }
}
