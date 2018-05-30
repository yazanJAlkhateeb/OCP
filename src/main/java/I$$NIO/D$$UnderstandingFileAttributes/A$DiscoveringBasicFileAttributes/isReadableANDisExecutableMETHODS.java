package I$$NIO.D$$UnderstandingFileAttributes.A$DiscoveringBasicFileAttributes;

import java.nio.file.Files;
import java.nio.file.Paths;

public class isReadableANDisExecutableMETHODS {
    public static void main(String[] args) {
        /*
        the
isReadable() and isExecutable() methods do not throw exceptions if the file does not
exist but instead return false
         */
        System.out.println(Files.isReadable(Paths.get("/seal/baby.png")));

        System.out.println(Files.isExecutable(Paths.get("/seal/baby.png")));
    }
}
