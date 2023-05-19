/**
 * null case compiler got confused which method should call.
 */
package topics._08_oops.a_28_polymorphism;

public class Ex3 {
    void show (StringBuffer a){
        System.out.println("StringBuffer method ");
    }
    void  show (String a){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        Ex3 r = new Ex3();
        r.show("abc");
        r.show(new StringBuffer("xyz"));
      //  r.show(null);
    }
}
