import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Runnre {

    public static void main(String args[]) throws CloneNotSupportedException {

        try (Reader reader = new FileReader("FileName");
            Writer writer = new FileWriter("fileWriter")) {


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
