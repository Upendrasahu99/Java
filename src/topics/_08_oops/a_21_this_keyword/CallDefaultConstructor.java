package topics._08_oops.a_21_this_keyword;

public class CallDefaultConstructor {
}
class A {
    A(){
        System.out.println("Name");
    }
    A(int a){
        this();
        System.out.println(a);
    }

    public static void main(String[] args) {
        A r = new A(50);
    }
}
