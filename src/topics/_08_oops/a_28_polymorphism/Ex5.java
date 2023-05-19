

package topics._08_oops.a_28_polymorphism;

public class Ex5 {
    void show(int a) {
        System.out.println("int method");
    }

    void show(int...a){
        System.out.println("varargs method");
    }

    public static void main(String[] args) {
        Ex5 r = new Ex5();
        r.show(10);
        r.show(4,5,3,3,6);
        r.show();
    }
}
