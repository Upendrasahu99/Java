package topics._08_oops.a_26_abstract;

public class AbstractClassProgram {
}
abstract class animals{
    public abstract void sound();
}
class Cat extends animal{
    public void sound(){
        System.out.println("Cat is ");
    }
}
class Lion extends animal{
    public void  sound(){
        System.out.println("Lion is Roar");
    }
}
class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        Lion l = new Lion();
        c.sound();
        l.sound();
    }
}