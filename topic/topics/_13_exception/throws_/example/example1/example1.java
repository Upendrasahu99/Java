//In this program if add age less than 18 it giv us InvalidAgeException.

package topics._13_exception.throws_.example.example1;

public class example1 {
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Age {
    public void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Invalid age must be more than 18");
        } else {
            System.out.println("Valid age");
        }
    }

    public static void main(String[] args) throws InvalidAgeException {
        Age person = new Age();
        try {
            person.checkAge(66);
            person.checkAge(3);
            person.checkAge(19);//previous line have exception that's why this method not implement.
        }
        catch (InvalidAgeException e){
            System.out.println(e);
        }
    }
}