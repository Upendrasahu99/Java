package topics._08_oops.a_28_polymorphism.example_overriding;

public class Bus extends Vehicle{
    @Override
    public void engineStart(){
        System.out.println("Bus Started ");
    }
    @Override
    public  void lightOn(){
        System.out.println("Bus Light On");
    }
    @Override
    public void lightOff(){
        System.out.println("Bus Light Off");
    }
}
