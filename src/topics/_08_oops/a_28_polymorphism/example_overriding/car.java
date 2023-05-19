package topics._08_oops.a_28_polymorphism.example_overriding;

 class car extends Vehicle {
     @Override
    public void engineStart(){
         System.out.println("Car Started ");
     }
     @Override
     public  void lightOn(){
         System.out.println("Car Light On");
     }
     @Override
     public void lightOff(){
         System.out.println("Car Light Off");
     }
}
