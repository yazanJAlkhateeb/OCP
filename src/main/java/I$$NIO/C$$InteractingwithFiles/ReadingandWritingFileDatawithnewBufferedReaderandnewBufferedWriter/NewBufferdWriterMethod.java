package I$$NIO.C$$InteractingwithFiles.ReadingandWritingFileDatawithnewBufferedReaderandnewBufferedWriter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NewBufferdWriterMethod {
    public static void main(String[] args) {
        /*
        The second method, Files.newBufferedWriter(Path,Charset) , writes to a file speci-
fied at the Path location using a BufferedWriter . Like the reader method, it also takes a
Charset value:*/
        Path path = Paths.get("/animals/gorilla.txt");
        List<String> data = new ArrayList();
        try (BufferedWriter writer = Files.newBufferedWriter(path,
                Charset.forName("UTF-16"))) {
            writer.write("Hello World");
        } catch (IOException e) {
// Handle file I/O exception...
        }

    }
}
