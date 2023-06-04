package topics._02_variables.local_variable.example1;

public class example1 {
    int m (int aa){

        System.out.println(aa);
        return 10;
    }
    void n (){
      int a = m(1);
        System.out.println(a);
//        System.out.println("2");//use other method local variable
    }

    public static void main(String[] args) {
        example1 example1 = new example1();
        example1.n();
    }
}
