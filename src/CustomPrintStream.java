import javax.swing.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by Максим on 20.09.2015.
 */
class CustomPrintStream extends PrintStream {
    public CustomPrintStream() {
        super(new ByteArrayOutputStream());
    }

    public void print(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
}