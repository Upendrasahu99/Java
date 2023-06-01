package topics._08_oops.a_18_method;

public class Method2 {
    int a = 10;
    static int b = 5;

    public static void main(String[] args) {
        Method2 r = new Method2();
//        r.disp1();
//        Method2.disp2();
        int t= 10;
        r.use(t);
    }

//    void disp1() {
//        System.out.println(a + " " + b);
//    }
//
//    static void disp2() {
//        Method2 r = new Method2();
//        System.out.println(r.a + " " + b);
//    }
    void use(int t){
        System.out.println(t);
    }
}
