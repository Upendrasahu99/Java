/**
 * super most class is object class that's why it called object method.
 */
package topics._08_oops.a_28_polymorphism;

public class Ex2 {
    void  show (Object a){
        System.out.println("Super most object class");
    }
    void  show (String a){
        System.out.println("string method");
    }

    public static void main(String[] args) {
        Ex2 r = new Ex2();
        r.show('a');
    }
}
