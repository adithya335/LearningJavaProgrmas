package Task_9_july;

public class Task9_Block_Without_Exception {
    public static void main(String[] args) {


    try {
        System.out.println("Inside try block.");
        int result = 10 / 2;  // No exception here
        System.out.println("Result: " + result);
    } catch (ArithmeticException e) {
        System.out.println("This catch block will be skipped.");
    } finally {
        System.out.println("Finally block always executes.");
    }

        System.out.println("Program continues normally.");
}
}
