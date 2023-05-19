/**
 * It is a default constructor.
 * It gives 0 and null defult value of int and String.
 *
 */

package topics._08_oops.a_19_constructor;

public class DefultConstructorByCompiler {}

    class Animal{
    int age;
    String name; // We don't give any value to this variable but compiler automatically create constructor and save default value

    //    Animal(){
//        age =o(defult value); name = "null"(defult value);
//    }
    void show() {

        System.out.println(age + " " + name);
    }
}

class C {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.show();
    }
}

