/***
 * use multiple catch block.
 * In last catch block we can use only Exception  in case other Exception are not match Exception(Super Class) will handle.
 */

package topics._13_exception;

import java.util.InputMismatchException;

public class MultipleCatch {
    public static void main(String[] args) {
        try {

        } catch (ArithmeticException e) {

        } catch (NullPointerException e) {

        } catch (InputMismatchException e) {

        } catch (Exception e) {

        }
    }
}
