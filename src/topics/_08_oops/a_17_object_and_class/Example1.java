/**
 * We can call other class object using there class name to create an object
 * only one main method required in hole program  to run the code.
 * class AnimalClass and Bird are physical entity.
 * object dog,cat and parrot is real word entity they have state/attribute(variable)  and behaviour(method).
 */

package topics._08_oops.a_17_object_and_class;

public class Example1 {

}

class AnimalClass {
    String color;

    public void eat() {
        System.out.println("eating");
    }

    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        AnimalClass dog = new AnimalClass();
        AnimalClass cat = new AnimalClass();
        Bird parrot = new Bird();
        parrot.fly();
        dog.eat();
        dog.run();
        cat.eat();
        dog.color = "black";
        cat.color = "white";
        System.out.println(dog.color);
        System.out.println(cat.color);
    }
}

class Bird {
    public void fly() {
        System.out.println("flying");
    }
}
