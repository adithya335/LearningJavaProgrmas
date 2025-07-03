package July3Tasks.MethodOverloading;

public class GreetUser {

    public static void main(String[] args) {
        greet();
        greet("blaze");
    }
    public static void greet(){
        System.out.println("hello");
    }
    public static void greet(String name){
        System.out.printf("hello %s",name);
    }
}
