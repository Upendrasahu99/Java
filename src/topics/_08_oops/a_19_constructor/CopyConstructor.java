/**
 *
 */
package topics._08_oops.a_19_constructor;

public class CopyConstructor {
}

class Human {
    int age;
    String name;

    Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Human(Human ref) { //it copies upper constructor variable value by reference(ref) variable.
        age = ref.age + 3;
        name = ref.name;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Human men1 = new Human(20, "jhon");
        men1.display();
        Human men2 = new Human(men1);
        men2.display();
    }

}