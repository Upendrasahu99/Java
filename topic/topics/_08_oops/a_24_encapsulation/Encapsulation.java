package topics._08_oops.a_24_encapsulation;

public class Encapsulation {

}
class A {
    private int value;//data hiding

    public void setValue(int x) {//data abstraction
        this.value = x;//value =100;

    }

    public int getValue() {
        return value;
    }
}
class B{
    public static void main(String[] args) {
        A r = new A();
        r.setValue(100);
        System.out.println(r.getValue());
    }
}