package Tasks.July_8th;

public class Comparisons {
    public static void main(String[] args) {
        Integer number = 10;
        Integer number2 = 10;
        int num = 100;

        // Comparing the Wrapper class obj using ==
        System.out.println("Using == " + (number == number2));
        System.out.println("***************************************");
        System.out.println("Using .equals method: " + (number.equals(number2)));
        System.out.println("***************************************");
        System.out.println("Comparing one obj and one primitive with same value: "+(number==num));
        System.out.println("***************************************");
        System.out.println("Comparing one obj and one primitive with same value: "+(number.equals(num)));

    }
}
