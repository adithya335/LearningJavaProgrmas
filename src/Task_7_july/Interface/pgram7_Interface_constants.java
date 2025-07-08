package Task_7_july.Interface;

public class pgram7_Interface_constants {
    public static void main(String[] args) {
 Car1 obj1= new Car1();
 obj1.showMaxSpeed();
    }
}
interface  SpeedLimit
{
    int MAX_SPEED = 120; // By default: public, static, and final
}

class Car1
{
    void showMaxSpeed()
    {
        System.out.println("car speed is:" +SpeedLimit.MAX_SPEED);
    }
}
//✅ Can be accessed using the interface name (e.g., SpeedLimit.MAX_SPEED)

//❌ Cannot be modified — it’s a constant.