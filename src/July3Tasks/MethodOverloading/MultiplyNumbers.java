package July3Tasks.MethodOverloading;

public class MultiplyNumbers {

    public static void main(String[] args) {
        multiply(5,4);
        multiply(5,4,3);
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void multiply(int a, int b, int c) {
        System.out.println(a * b * c);
    }
}
