package Task_7_july.Interface;

public class pgram5_Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {
 Document obj= new Document();
 obj.print();
 obj.show();
    }
}
 interface Printable {
     void print();
 }

 interface Showable
 {
     void show();
 }

 class Document implements Printable, Showable
{
public void print()
    {
        System.out.println("Printing Document");
    }

    public void show()
    {
        System.out.println("Showing Document");
    }
        }