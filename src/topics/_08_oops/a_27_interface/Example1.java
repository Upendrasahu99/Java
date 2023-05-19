package topics._08_oops.a_27_interface;

public class Example1 {
}

interface I1 {
    void show();
}

class Test implements I1 {
    public void show() {
        System.out.println("1");
    }

    public static void main(String[] args) {
        //I1 i = new I1();
        Test t = new Test();
        t.show();
    }
}