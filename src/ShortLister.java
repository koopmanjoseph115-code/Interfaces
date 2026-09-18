import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister
{
    public static void main(String[] args) throws IOException {
        JFileChooser chooser = new JFileChooser();
        if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File selectedFile = chooser.getSelectedFile();
            Path file = selectedFile.toPath();
            // Typical java pattern of inherited classes
            // we wrap a BufferedWriter around a lower level BufferedOutputStream
            InputStream in =
                    new BufferedInputStream(Files.newInputStream(file, CREATE));
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(in));

            // Finally we can read the file LOL!
            int line = 0;  // if we want to keep track of the line numbers
            while (reader.ready()) {
                String rec = reader.readLine();
               Filter filter = new ShortWordFilter();
               if (filter.accept(rec)){
                   System.out.println(rec);
               }
            }
            reader.close();
        }// must close the file to seal it and flush buffer
            System.out.println("\n\nData file read!");
    }
}
