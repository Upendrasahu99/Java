package topics._08_oops.a_28_polymorphism;

public class MethodOverriding {
}
class Shape{
    void draw(){
        System.out.println("Can't say shape type");
    }
}
class  Square extends Shape{

    @Override
    void draw() {
        System.out.println("Square shape");
        super.draw();//using super keyword to call super class method
    }
}
class Demo{
    public static void main(String[] args) {
        Shape r =new Square();
        r.draw();
    }
}