package topics._02_variables;

public class VariableType {

    static int b = 20;//static variable
    int c = 30;//instance variable

    public static void main(String[] args) {
        int a = 10; //local variable
        VariableType ref = new VariableType();//Make object for call instance variable,for make obeject we take ref for refrence variable and new for create object
        System.out.println(a);//call local vaiable
        System.out.println(VariableType.b); //call static variable print class name with variable name
        System.out.println(ref.c);//call instance variable with help of refrence variable

    }

}