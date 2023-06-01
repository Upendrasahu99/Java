/**
* It is Compile time polymorphism
* different behaviour
* Same method with different parameter(argument),different datatype, different number of argumnet.
* If data type is same than it's not work
* We can't achieve method overloading only changing return type.
* WE can have any number of main methods in a class by method over loading.
 */
package topics._08_oops.a_28_polymorphism;

public class MethodOverloading {

}
class A{
    void add(){
        int a=10,b=20,c;
        c= a+b;
        System.out.println(c);
    }
    void add (int x){
        int c = x;
        System.out.println(c);
    }
    void add(int x, int y){
        int c;
        c=x+y;
        System.out.println(c);
    }
    void add(int x, double y){
        double c;
        c =x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        A r = new A();
        r.add();//of we don't give any value in parameter it understands which method have to call
        r.add(40);
        r.add(50,60);
        r.add(60, 40.6);
        r.main(3);
    }
    public  static void main(int i){
        System.out.println(3);
    }
}
