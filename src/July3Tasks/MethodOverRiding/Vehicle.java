package July3Tasks.MethodOverRiding;

public class Vehicle {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Vehicle bike=new Bike();
        Vehicle car= new Car();
        vehicle.start();
        bike.start();
        car.start();

    }
    public void start() {
        System.out.println("Vehicle started");
    }
}

class Bike extends Vehicle {
    @Override
    public void start() {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle {
    @Override
    public void start() {
        System.out.println("Turn the key to start the car");
    }
}
