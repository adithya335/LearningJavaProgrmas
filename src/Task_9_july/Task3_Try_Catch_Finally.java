package Task_9_july;

public class Task3_Try_Catch_Finally {
    public static void main(String[] args) {

        int[] num= { 1,2,3};

        // Accessing invalid index
        try {
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
        System.out.println("end program");


    }
}
