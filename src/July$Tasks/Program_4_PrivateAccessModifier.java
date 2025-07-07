package ex_00_Task.Lab_13_4July;

public class Program_4_PrivateAccessModifier
{
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("Amol Tarapure");
        System.out.println("Name " + person.getName());


    }
}


class Person
{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}