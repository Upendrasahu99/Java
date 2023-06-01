/**
 * Definition : class having only one responsibility.
 */

package topics._18_solid_principle.single_responsibility;

public class Example1 {
}
class Calculator{
    public  int add(int a, int b){
        return a+b;
    }
    public  int subtract(int a, int b){
        return  a-b;
    }
}

// Other methods related to mathematical operations can be added here, as long as they are related to the Calculator
