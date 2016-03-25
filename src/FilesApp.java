import java.io.*;

public class FilesApp {

    public static void main(String text,String txr) {

        try(FileWriter writer = new FileWriter(txr, false))
        {
            writer.write(text);

            writer.append('\n');

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}