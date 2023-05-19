package topics._08_oops.a_28_polymorphism.example_overloding;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();

    }
}
