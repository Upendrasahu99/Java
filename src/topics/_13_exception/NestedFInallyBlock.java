package topics._13_exception;

public class NestedFInallyBlock {
    public static void main(String[] args) {
        try {

        } catch (Exception e) {

        } finally {
            try {
            } catch (Exception e) {
            } finally {
            }
        }
    }
}

