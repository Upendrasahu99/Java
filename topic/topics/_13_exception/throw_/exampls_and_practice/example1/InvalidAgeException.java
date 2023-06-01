package topics._13_exception.throw_.exampls_and_practice.example1;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Age {
    private int age;

    Age(int age) {
        this.age = age;
    }

    public void checkAge(int age) {
        this.age = age;
        try {
            if(age < 0) {
                throw new InvalidAgeException("Not valid age"); // explicitly throw an exception
            }else {
                System.out.println("Valid age");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Age person = new Age(-5);
        person.checkAge(-3);
        person.checkAge(5);
        person.checkAge(-4);
    }
}
