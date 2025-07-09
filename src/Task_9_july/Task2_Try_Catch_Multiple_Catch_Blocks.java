package Task_9_july;

public class Task2_Try_Catch_Multiple_Catch_Blocks {
    public static void main(String[] args) {

        int[] marks= {1,2,3};
        try {
            int result= marks[2]/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }


    }
}
