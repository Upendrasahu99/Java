/**
 * From Animal class example we can understand why class is called blueprint.
 * In this code Animal is blueprint with use of blueprint we can create many animal (dog,cat etc.) object and give value
 *
 */

package topics._08_oops.a_17_object_and_class;

public class ClassBluePrint {

}

class Animal {
    // Fields (properties) of the Animal class
    private String name;
    private int age;
    private String species;

    // Constructor method for creating new Animal objects
    Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }

    // Methods (behaviors) of the Animal class
    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void makeSound() {
        System.out.println(name + " is making a sound.");
    }

    // Getter and setter methods for accessing and modifying the fields of an Animal object
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("max",4,"dog");//using animal class blueprint create object of "animal1" and give all detail.
        System.out.println(animal1.name);
        System.out.println(animal1.age);
        System.out.println(animal1.species);
    }
}
