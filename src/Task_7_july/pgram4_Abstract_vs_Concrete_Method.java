package Task_7_july;

public class pgram4_Abstract_vs_Concrete_Method {
    public static void main(String[] args) {
 Parent obj= new Child();
 obj.show();
 obj.display();
    }
}

abstract class Parent {
    abstract void show();

    void display()
    {
        System.out.println("Concrete method in abstract class");
    }
}

class Child extends Parent{
    void show()
    {
        System.out.println("Abstract method implemented");
    }
}