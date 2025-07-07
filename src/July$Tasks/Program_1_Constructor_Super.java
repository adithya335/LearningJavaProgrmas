package ex_00_Task.Lab_13_4July;

public class Program_1_Constructor_Super
{
    public static void main(String[] args)
    {
       Car car = new Car();

    }
}

class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicale -> DC");
    }
}

class Car extends Vehicle
{
    Car()
    {
        super();
    }
}