package I$$NIO.C$$InteractingwithFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/*IMP
By default, the move() method will follow links, throw an exception if the fi le
already exists, and not perform an atomic move. These behaviors can be changed by
providing the optional values NOFOLLOW_LINKS , REPLACE_EXISTING , or ATOMIC_MOVE ,
respectively, to the method. If the fi le system does not support atomic moves, an
AtomicMoveNotSupportedException will be thrown at runtime.
 */
public class moveMETHOD {
    public static void main(String[] args) {
        /*
        The Files.move(Path,Path) method moves or renames a fi le or directory within the fi le
system. Like the copy() method, the move() method also throws the checked IOException
in the event that the fi le or directory could not be found or moved.
The following is some sample code that uses the move() method:
*/
try {
Files.move(Paths.get("c:\\zoo"), Paths.get("c:\\zoo-new"), StandardCopyOption.ATOMIC_MOVE);

Files.move(Paths.get("c:\\user\\addresses.txt"),
Paths.get("c:\\zoo-new\\addresses.txt"));
} catch (IOException e) {
// Handle file I/O exception...
}

    }
}
