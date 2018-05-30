package I$$NIO.D$$UnderstandingFileAttributes.B$ImprovingAccesswithViews;

public class Concept {
    /*
    The Files API includes two sets of methods of analogous classes for accessing view
information. The first method, Files.readAttributes() , returns a read-only view of the
file attributes. The second method, Files.getFileAttributeView() , returns the underlying
attribute view, and it provides a direct resource for modifying file information.
Both of these methods can throw a checked IOException
     */
    /*
    trying to read Windows-based attributes within a Linux
file system may throw an UnsupportedOperationException .
     */
/*
The attributes and view classes
Attributes Class           View Class                Description
BasicFileAttributes      BasicFileAttributeView    Basic set of attributes supported by
                                                   all file systems
DosFileAttributes        DosFileAttributeView      Attributes supported by DOS/
                                                   Windows-based systems
PosixFileAttributes      PosixFileAttributeView    Attributes supported by POSIX
                                                        systems, such as UNIX, Linux, Mac,
                                                        and so on
 */

}

