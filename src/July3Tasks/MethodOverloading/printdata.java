package July3Tasks.MethodOverloading;

public class printdata {

    public static void main(String[] args) {
        print("test");
        print(5);
        print(5.4f);

    }

    public static void print(String data) {
        System.out.println(data);
    }

    public static void print(int data) {
        System.out.println(data);
    }

    public static void print(float data) {
        System.out.println(data);
    }
}
