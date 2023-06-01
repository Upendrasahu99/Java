package topics._08_oops.a_25_inheritance;

public class Hierarchical_Inheritance {
}
class A{
    void eat(){
        System.out.println("Eating");
    }
    
}
class Sub1 extends A{

    public static void main(String[] args) {
        Sub1 a = new Sub1();
        a.eat();
    }
    
}
class Sub2 extends A{
    
}
class sub3 extends A{

}