package Task_9_july;

public class Task6_Catch_Specific_vs_Generic_Exception {
    public static void main(String[] args) {
        System.out.println(" case1:Generic Catch");
        String str= null;
        try {
            System.out.println(str.toLowerCase());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("case2:Specific Catch");
        try {
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }


    }
}
