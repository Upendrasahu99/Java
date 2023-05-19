/**
 * Initialize object using reference variable.
 */

package topics._08_oops.a_17_object_and_class;

public class Example2 {

}
class Animal2{
    String color;
    int age;

    public static void main(String[] args) {

        Animal2 dog = new Animal2();
        dog.color = "black";//initializing object;
        dog.age = 3;//initializing object;
        System.out.println(dog.age + " " + dog.color);
    }
}
