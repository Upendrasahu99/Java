/**
 * NumberFormatException Used in given program.
 * "Integer.parseInt" change string into number format if it's possible.
 *
 */


package topics._13_exception;

public class NumberFormat {
    public static void main(String[] args) {

        String str = "raja";
        try {
            int a = Integer.parseInt(str);
            System.out.println(a);
            System.out.println("Changed into Integer format");
        } catch (NumberFormatException n) {
            System.out.println("Given String " + str + " cannot be converted to Integer");
        }
        System.out.println("main method ended");
   //------------------------------------------------------------------------------------------

        //        String str2 = "1234";
//        try {
//            int b = Integer.parseInt(str2);
//            System.out.println(b);
//            System.out.println("Changed into Integer format");
//        } catch (NumberFormatException n) {
//            System.out.println("Given String format cannot be converted to Integer");
//        }
//        System.out.println("main method ended");
    }
}

