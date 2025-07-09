package Task_9_july;

public class Task1_try_Catch_with_ArithmeticException {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        try {
            int z= x/y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }
}
