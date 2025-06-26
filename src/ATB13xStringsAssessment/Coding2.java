package ATB13xStringsAssessment;

public class Coding2 {

    public static void main(String[] args) {
        String one = "Hello";
        String two = "hello";
        String three = "Hello";

        System.out.println(one==three);
        System.out.println(one==two);
        System.out.println(one.equals(three));
        System.out.println(one.equalsIgnoreCase(two));
        System.out.println(one.compareTo(two));
        System.out.println(one.compareTo(three));
    }
}
