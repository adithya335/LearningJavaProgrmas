package Task_7_july;

public class pgram3_Abstract_Constructor {
    public static void main(String[] args) {
 Color obj1= new Black();
 obj1.showColor();

 Color obj2 = new White();
 obj2.showColor();
    }
}

abstract class Color
{
    Color()
    {
        System.out.println("Abstract class constructor called");
    }
    void showColor()
    {
       System.out.println("Method from abstract class");
    }
}

class Black extends Color
{
    void showColor()
    {
        //System.out.println("black");
    }
}

class White extends Color{
    void showColor()
    {
       // System.out.println("white");
    }
}
