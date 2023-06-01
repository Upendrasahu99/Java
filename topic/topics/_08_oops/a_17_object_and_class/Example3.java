/**
 * Initialization object using method.
 * initObj is part of class that's why we directly access instance variable but main method is not part of class that's why we have to create object to access instance variable.
 */

package topics._08_oops.a_17_object_and_class;

public class Example3 {
}
class Animal3{
    String color;
    int age;

    void initObj (String c , int a){ // attribute or state of object.
        color = c;
        age =a;
    }
    void display (){
        System.out.println(color + " " + age);
    }

    public static void main(String[] args) {
        Animal3 dog = new Animal3();
        dog.initObj("white", 4);
        dog.display();
    }
}
