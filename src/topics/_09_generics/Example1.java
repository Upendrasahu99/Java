//use of generic we can write multiple dat type code in single program, we don't need to write different-different program for every data type .

package topics._09_generics;

public class Example1<T> {
    void print(T data) {
        System.out.println(data);
    }

    public static void main(String[] args) {
        Example1<Integer> printInteger = new Example1<>();
        printInteger.print(4);
//        printInteger.print("cat"); not  possible we take only Integer type
        Example1<String> printString = new Example1<>();
        printString.print("Ram");
        Example1<Double> printDouble = new Example1<>();
        printDouble.print(4.3);
    }
}

