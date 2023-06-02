package topics._14_lambda_expressions.example.example1;

import topics._03_data_type.DataType;

@FunctionalInterface
public interface Drawable {
    public void draw();
}

class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        // with lambda
        //(argument-list) -> {body}
        Drawable d2 = () -> {System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}

//without lambda codw

/*
public interface Drawable {
    public void draw();
}

class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        // without lambda, Drawable implementation using anonymous class

        Drawable d = new Drawable() {
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
*/