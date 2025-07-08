package Task_7_july.Interface;

public class pgram_8_Interface_Polymorphism {
    public static void main(String[] args) {
        Playable Instrument;

        Instrument = new  Guitar();
         Instrument.play();
         Instrument = new Piano();
         Instrument.play();
    }
}
interface Playable
{
    void play();
}

class Guitar implements Playable
{
 public void play()
{
    System.out.println("play a Guitar ");
}
}

class Piano implements Playable{
  public void play()
    {
        System.out.println("play a Piano ");
    }

}
