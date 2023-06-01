package topics._08_oops.a_18_method;

import java.util.Random;
import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Method m = new Method();
        Scanner sc = new Scanner(System.in);
        Random r = new Random(10);
        display();

        m.display2();
        m.display2();
        m.display2();
        m.display2();
        m.display2();
        m.display2();
        m.add(r.nextInt(), sc.nextInt());
    }
    static void display(){
        System.out.println("Display the code");
    }
    void display2(){
        System.out.println("Display second method ");
    }
    public int add(int a,int b){
        System.out.println("a" + a);

        int c;
        c=a+b;
        System.out.println(c);
        int d=c*a;
        System.out.println(d);

        return d;
    }
}


