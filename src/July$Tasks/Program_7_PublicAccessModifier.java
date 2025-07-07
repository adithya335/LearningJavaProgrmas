package ex_00_Task.Lab_13_4July;

public class Program_7_PublicAccessModifier
{
    public static void main(String[] args)
    {
        Student_1 s1 = new Student_1();
        s1.showInfo();
    }
}

class Student_1
{
    public void showInfo()
    {
        System.out.println("Public Access: Student Info");
    }
}