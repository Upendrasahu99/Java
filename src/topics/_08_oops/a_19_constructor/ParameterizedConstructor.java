package topics._08_oops.a_19_constructor;

public class ParameterizedConstructor {}
    class Dog{
    String name;
    int age;
    Dog(String name, int age)//parameterized
    {
       this.name = name;
       this.age = age;

    }
    void show (){

        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        Dog Dog1 = new Dog("tom",2);
        Dog1.show();
        Dog Dog2 = new Dog("max",5);
        Dog2.show();
    }
}