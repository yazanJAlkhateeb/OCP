package I$$NIO.D$$UnderstandingFileAttributes.A$DiscoveringBasicFileAttributes;

import java.nio.file.Files;
import java.nio.file.Paths;
/*IMP
Exception Handling
You may notice when browsing the Files API that isDirectory() , isRegularFile() , and
isSymbolicLink() do not throw an exception if the path does not exist, so the following
code is redundant:
if(Files.exists(path) && Files.isDirectory(path)) {
This code could be replaced with a single Files.isDirectory() method call since the
exists() call is unnecessary:
if(Files.isDirectory(path)) {
 */
public class isDirectoryANDisRegularFileANDisSymbolicLinkMETHODS {
    public static void main(String[] args) {
        /*
        The Files class includes three methods for determining if a path refers to a directory, a regular
file, or a symbolic link. The methods to accomplish this are named Files.isDirectory(Path) ,
Files.isRegularFile(Path) , and Files.isSymbolicLink(Path) , respectively.
         */
        /*
        If the symbolic link points to a real file or directory, Java will perform the check on the
target of the symbolic link. In other words, it is possible for isRegularFile() to return
true for a symbolic link, as long as the link resolves to a regular file.
         */
        Files.isDirectory(Paths.get("/canine/coyote/fur.jpg"));

        Files.isRegularFile(Paths.get("/canine/types.txt"));

        Files.isSymbolicLink(Paths.get("/canine/coyote"));
    }
}
