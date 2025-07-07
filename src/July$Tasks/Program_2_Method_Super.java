package ex_00_Task.Lab_13_4July;

public class Program_2_Method_Super
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.display();
    }
}

class Animal
{
    void sound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog  extends Animal
{
    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        sound();          // Calls child class method
        super.sound();    // Calls parent class method using 'super'
    }
}