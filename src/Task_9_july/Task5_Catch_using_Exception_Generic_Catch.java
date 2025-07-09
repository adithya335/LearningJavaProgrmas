package Task_9_july;

public class Task5_Catch_using_Exception_Generic_Catch {
    public static void main(String[] args) {
        try {
            int r= 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
