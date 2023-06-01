/**
 * Automatic Promotion
 *
 * One type is promoted to another implicitly if no matching datatype is found.
 */
package topics._08_oops.a_28_polymorphism;

public class Ex1 {
    void show (int a){
        System.out.println("int method");
    }
    void show (String a){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        Ex1 r = new Ex1();
        r.show('a');
    }
}
