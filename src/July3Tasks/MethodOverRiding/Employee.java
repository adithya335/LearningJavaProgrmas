package July3Tasks.MethodOverRiding;

public class Employee {

    public static void main(String[] args) {

        Employee employee=new Employee();
        Employee manager=new Manager();
        Employee clerk=new Clerk();

        employee.role();
        manager.role();
        clerk.role();

    }

    public void role(){
        System.out.println("General Employee”");
    }
}
class Manager extends Employee{

    public void role(){
        System.out.println("Manager");
    }
}

class Clerk extends Employee{

    public void role(){
        System.out.println("Clerk");
    }
}