package I$$NIO.D$$UnderstandingFileAttributes.A$DiscoveringBasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;

/*In order to set a fi le owner to an arbitrary user, the NIO.2 API provides a
UserPrincipalLookupService helper class for fi nding a UserPrincipal record for a
particular user within a fi le system. In order to use the helper class, you fi rst need to obtain
an instance of a FileSystem object, either by using the FileSystems.getDefault() method
or by calling getFileSystem() on the Path object with which you are working*/
public class getOwnerANDsetOwnerMETHODS {
    public static void main(String[] args) {
/*the Files.getOwner(Path) method returns an instance of UserPrincipal that
represents the owner of the fi le within the fi le system*/

/*there is also a method to set the owner, called Files
.setOwner(Path,UserPrincipal)*/

/*Both the getOwner() and setOwner() methods can throw the checked exception IOException in
case of any issues accessing or modifying the fi le.*/
        try {
// Read owner of file
            Path path = Paths.get("/chicken/feathers.txt");
            System.out.println(Files.getOwner(path).getName());
            UserPrincipal owner1 = Files.getOwner(path);


// Change owner of file
            UserPrincipal owner = path.getFileSystem()
                    .getUserPrincipalLookupService().lookupPrincipalByName("jane");
            Files.setOwner(path, owner);
// Output the updated owner information
            System.out.println(Files.getOwner(path).getName());
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
