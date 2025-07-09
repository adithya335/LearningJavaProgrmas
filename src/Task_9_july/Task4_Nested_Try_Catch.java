package Task_9_july;

public class Task4_Nested_Try_Catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

            int[] mark = {10, 20, 30};
            try {
                System.out.println(mark[6]);
            } catch (ArrayIndexOutOfBoundsException e1) {
                System.out.println(e.getMessage());
            }
            System.out.println("Program continues after nested try-catch.");


        }
    }
}