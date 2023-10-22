import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fReader = new FileReader("Numbers.txt");
            BufferedReader bffReader = new BufferedReader(fReader);

            int total = 0;
            String line;

            while ((line = bffReader.readLine()) != null) {  //until the line is null.
                total += Integer.parseInt(line);   //Type casting
                System.out.println("Total is now: "+ total);
            }
            System.out.println("Process completed");
            System.out.println("Process result: "+total);
            fReader.close();
            bffReader.close(); //Streams are closed.

        } catch (IOException e) { //File read operations could throw an `IOException` error.
            System.out.println(e.getMessage());
        }
    }
}
