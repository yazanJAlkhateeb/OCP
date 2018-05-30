package I$$NIO.C$$InteractingwithFiles;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;

public class existsMETHOD {
    /*.
    The Files.exists(Path) method takes a Path object and returns true if, and only if, it
references a fi le that exists in the fi le system.

Let’s take a look at some sample code:
*/
    public static void main(String[] args) {
        Files.exists(Paths.get("/ostrich/feathers.png"), LinkOption.NOFOLLOW_LINKS);

        Files.exists(Paths.get("/ostrich"));
    }
}
