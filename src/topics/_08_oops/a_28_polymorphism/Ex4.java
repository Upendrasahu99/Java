/**
 * If number of argument are more than it not promote the data type
 * example : r.show(10,40);
 *
 * for reference watch the chart of "Automatic Promotion".
 *
 */
package topics._08_oops.a_28_polymorphism;

public class Ex4 {
    void show(int a, float b){
        System.out.println("int float method");
    }
    void show(float a, int b){
        System.out.println("float int method");
    }

    public static void main(String[] args) {
        Ex4 r = new Ex4();
        r.show(10,20.3f);
        r.show(30.4f, 30);
  //      r.show(10,40);
    }
}
