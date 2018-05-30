package I$$NIO.D$$UnderstandingFileAttributes.A$DiscoveringBasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class isHiddenMETHOD {
    public static void main(String[] args) {
        /*
        In Linux- or Mac-based systems, this
is often denoted by file or directory entries that begin with a period character ( . ), while
in Windows-based systems this requires the hidden attribute to be set. The isHidden()
method throws the checked IOException , as there may be an I/O error reading the underly-
ing file information
         */
        try {
            System.out.println(Files.isHidden(Paths.get("/walrus.txt")));
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
