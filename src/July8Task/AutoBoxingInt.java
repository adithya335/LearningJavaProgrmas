package Tasks.July_8th;

public class AutoBoxingInt {
    public static void main(String[] args) {
        int number = 123;

        // Autoboxing the int number to its Wrapper class
        Integer num = number;

        System.out.println("Primitive number: "+number);
        System.out.println("***************************************");
        System.out.println("Wrapper class number is: " + num);
    }
}
