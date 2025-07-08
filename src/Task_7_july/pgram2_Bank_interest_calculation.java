package Task_7_july;

public class pgram2_Bank_interest_calculation {
    public static void main(String[] args) {
      Bank obj1= new SBI();
      obj1.getInterestRate();

      Bank obj2= new HDFC();
      obj2.getInterestRate();
    }
}
 abstract class Bank
 {
     abstract void getInterestRate();
 }
class SBI extends Bank
{
    void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank
{
    void getInterestRate()
    {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}