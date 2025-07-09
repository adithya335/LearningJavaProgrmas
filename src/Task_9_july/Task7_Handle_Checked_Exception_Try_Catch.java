package Task_9_july;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task7_Handle_Checked_Exception_Try_Catch {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("data.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("end program");
    }
}
