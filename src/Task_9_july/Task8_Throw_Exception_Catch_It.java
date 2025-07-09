package Task_9_july;

public class Task8_Throw_Exception_Catch_It {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Manually thrown ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program continues after exception handling.");
    }
    }

