package topics._08_oops.a_25_inheritance;

public class Multi_level_Inheritance {

}
class Animal{//super
    void eat(){System.out.println("eating...");}
}
class Dog extends Animal {//sub1
    void bark(){System.out.println("barking...");}
}
class BabyDog extends Dog{//sub2
    void weep(){System.out.println("weeping...");}
}
class TestInheritance2 extends BabyDog{
    public static void main(String args[]){//object of sub2 and we can use super and sub1 class feature.
        TestInheritance2 d=new TestInheritance2();
        d.weep();
        d.bark();
        d.eat();
    }}
