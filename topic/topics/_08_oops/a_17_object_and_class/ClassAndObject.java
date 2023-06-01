/*
 *class doesn't take any memory but when object is created  object ask for memory space where it stores value
 */

package topics._08_oops.a_17_object_and_class;

public class ClassAndObject {
    int a = 10;
    String b = "ram";

    void show() {
        System.out.println(a + " " + b);
    }

    void show2() {

        System.out.println(a);
    }
}

class Test {
    public static void main(String[] args) {

        ClassAndObject r = new ClassAndObject();//object creation
        r.show();//call method
    }
}

class Test2 {
    public static void main(String[] args) {
        ClassAndObject r2;
        r2 = new ClassAndObject();//object creation different type
        r2.show2();
    }
}
