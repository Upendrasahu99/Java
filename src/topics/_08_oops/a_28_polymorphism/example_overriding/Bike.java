package topics._08_oops.a_28_polymorphism.example_overriding;

public class Bike extends Vehicle{
    @Override
    public void engineStart(){
        System.out.println("Bike Started ");
    }
    @Override
    public  void lightOn(){
        System.out.println("Bike Light On");
    }
    @Override
    public void lightOff(){
        System.out.println("Bike Light Off");
    }
}
