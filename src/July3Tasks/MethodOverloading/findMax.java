package July3Tasks.MethodOverloading;

public class findMax {

    public static void main(String[] args) {
        max(5, 4);
        max(5, 4, 6);
        max(6, 4, 5);
        max(5.5, 6.2);
    }

    public static void max(int a, int b) {
        System.out.println(Math.max(a, b));
    }

    public static void max(int a, int b, int c) {
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println(max);
    }

    public static void max(double a, double b) {
        System.out.println(Math.max(a, b));
    }
}
