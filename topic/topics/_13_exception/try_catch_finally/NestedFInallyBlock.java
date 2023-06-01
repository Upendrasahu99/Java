package topics._13_exception.try_catch_finally;

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

