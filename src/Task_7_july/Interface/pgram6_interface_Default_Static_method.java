package Task_7_july.Interface;

public class pgram6_interface_Default_Static_method {
    public static void main(String[] args) {

Car c= new Car();
c.strat();

Vehicle.fuelType(); //Call static method directly from interface

    }
}

interface Vehicle
{
    default void strat()
    {
        System.out.println("Vehicle started");
    }
    static void fuelType()
    {
        System.out.println("Fuel type is petrol");
    }
}

class Car implements Vehicle{

}
