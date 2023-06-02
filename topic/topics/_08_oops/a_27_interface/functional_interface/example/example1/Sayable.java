package topics._08_oops.a_27_interface.functional_interface.example.example1;

import java.util.HexFormat;

@FunctionalInterface // It is optional
public interface Sayable {
    void say(String msg); //Only one abstract method
}
class FunctionalInterfaceExample implements Sayable{
    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
       FunctionalInterfaceExample file = new FunctionalInterfaceExample();
        file.say("Hello");
    }
}