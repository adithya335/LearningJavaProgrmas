package July3Tasks.MethodOverloading;

import com.sun.tools.javac.Main;

public class AddtwoNumbers {

    public static void main(String[] args) {
        AddtwoNumbers addtwoNumbers=new AddtwoNumbers();
        addtwoNumbers.add(5,4);
        addtwoNumbers.add(5.5,4.1);
    }

    public void add(int a, int b) {
        System.out.printf("a+b=%d", a + b);
    }

    public void add(double a, double b) {
        System.out.printf("a+b=%f", a + b);
    }
}
