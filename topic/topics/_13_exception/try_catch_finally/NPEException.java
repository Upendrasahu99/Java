/**
 * NPEException (NullPointerException)
 * NullPointerException is predefined Exception
 */
package topics._13_exception.try_catch_finally;

public class NPEException {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.toUpperCase());
        }
        catch (NullPointerException n){
            System.out.println("null can't be casted");
        }
    }
}
