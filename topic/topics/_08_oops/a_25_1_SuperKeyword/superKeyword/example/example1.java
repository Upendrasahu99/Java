package topics._08_oops.a_25_1_SuperKeyword.superKeyword.example;

public class example1 {
}
class Shape{
    String color;

    public Shape(String color){
        this.color = color;
    }
    public void displayInformation(){
        System.out.println("Color : " + color);
    }
}
class Rectangle extends Shape{
    int length;
    int height;
    Rectangle(String color, int length, int height){
        super(color);//Parent class constructor call
        this.length = length;
        this.height = height;
    }
    public int getArea(){
        return length*height;
    }
    @Override
    public void displayInformation(){
        super.displayInformation();//parent class method call
        System.out.println("length : " + length);
        System.out.println("height : " + height);
        System.out.println("Area : " + getArea());
    }

    public static void main(String[] args) {
        Rectangle input = new Rectangle("Red", 6,5);
        input.getArea();
        input.displayInformation();
    }
}