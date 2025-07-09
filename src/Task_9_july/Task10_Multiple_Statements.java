package Task_9_july;

public class Task10_Multiple_Statements {
    public static void main(String[] args) {
        try {
            System.out.println(" Step1: Start Program");

            int result = 10 / 0;

            System.out.println("Step2:This won't be executed");
            String name = "Tanjila";
            System.out.println("Step3:Name is" + name);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Program end");
    }
    }
