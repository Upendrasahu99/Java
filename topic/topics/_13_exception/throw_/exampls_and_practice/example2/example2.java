package topics._13_exception.throw_.exampls_and_practice.example2;

public class example2 {
}

class EmptyException extends Exception { //Creating EmptyException by extending super keyword
    EmptyException(String message) {
        super(message); // // calling the superclass constructor
    }
}

class Calculator {
    public void calculateAverage(int [] number) {
        try {
           if(number.length == 0){
            throw new EmptyException("Empty list");
           }
        } catch (EmptyException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        int [] number = new int[0];
       Calculator input = new Calculator();
       input.calculateAverage(number);
    }
}

