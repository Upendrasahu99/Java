package topics._09_generics;

class Example2<t, v, u> {
    void print(t data1, v data2, u data3) {
        System.out.println(data1 + " " + data2 + " " + data3);
    }

    public static void main(String[] args) {
        Example2<Integer, String, Double> print_ISD = new Example2<>();
        print_ISD.print(3, "jay", 4.5);
        Example2<Double, String, Integer> print_DSI = new Example2<>();
        print_DSI.print(5.4, "vicky", 5);
    }
}
