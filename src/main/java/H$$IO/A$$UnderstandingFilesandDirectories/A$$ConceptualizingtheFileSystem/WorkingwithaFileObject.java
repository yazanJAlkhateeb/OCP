package H$$IO.A$$UnderstandingFilesandDirectories.A$$ConceptualizingtheFileSystem;

public class WorkingwithaFileObject {

    /*
    The File class contains numerous useful methods for interacting with files and directories
within the file system. We present the most commonly used ones in Table 8.1. Although
this table may seem like a lot of methods to learn, many of them are self-explanatory. For
example, exists() returns true if the file or directory path exists and false otherwise.
Ta b l e   8 .1     Commonly used java.io.File methods
Method Name                 Description
exists()                    Returns true if the file or directory exists.
getName()                   Returns the name of the file or directory denoted by this path.
getAbsolutePath()           Returns the absolute pathname string of this path.
isDirectory()               Returns true if the file denoted by this path is a directory.
isFile()                    Returns true if the file denoted by this path is a file.
length()                    Returns the number of bytes in the file. For performance reasons, the
                            file system may allocate more bytes on disk than the file actually uses.
lastModified()              Returns the number of milliseconds since the epoch when the file
                            was last modified.
delete()                    Deletes the file or directory. If this pathname denotes a directory,
                            then the directory must be empty in order to be deleted.
renameTo(File)               Renames the file denoted by this path.
mkdir()                     Creates the directory named by this path.
mkdirs()                    Creates the directory named by this path including any nonexistent
                            parent directories.
getParent()                 Returns the abstract pathname of this abstract pathname’s parent
                            or null if this pathname does not name a parent directory.
listFiles()                 Returns a File[] array denoting the files in the directory.
     */
}
