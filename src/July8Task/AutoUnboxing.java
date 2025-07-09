package Tasks.July_8th;

public class AutoUnboxing {
    public static void main(String[] args) {
        Integer number = 20;

        // AutoUnboxing the Wrapper class obj to a primitive data type
        int num = number;

        System.out.println("Wrapper class obj number is: " + number);
        System.out.println("***************************************");
        System.out.println("Primitive data type is: "+num);
    }
}
