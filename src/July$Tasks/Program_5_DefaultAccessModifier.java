package ex_00_Task.Lab_13_4July;

public class Program_5_DefaultAccessModifier
{
    public static void main(String[] args)
    {
         Student s = new Student();
         s.showDetails();

         TestDefault td = new TestDefault();
         td.showDetails();
    }
}

class Student
{
    void showDetails()
    {
        System.out.println("Student details");
    }
}

class TestDefault extends Student
{
    void showDetails()
    {
        super.showDetails();
        System.out.println("Test details");
    }
}