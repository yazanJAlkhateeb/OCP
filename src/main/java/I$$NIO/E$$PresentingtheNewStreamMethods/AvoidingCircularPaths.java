package I$$NIO.E$$PresentingtheNewStreamMethods;

public class AvoidingCircularPaths {
    /*Unlike our earlier NIO.2 methods, the walk() method will not traverse symbolic links by
default. Following symbolic links could result in a directory tree that includes other, seem-
ingly unrelated directories in the search.*/

    /*
    Worse yet, symbolic links could lead to a cycle. A cycle is an infinite circular depen-
dency in which an entry in a directory is an ancestor of the directory. For example,
imagine that we had a directory /birds/robin that contains a symbolic link called
/birds/robin/allBirds that pointed to /birds . Trying to traverse the /birds/robin
directory would result in an infinite loop since each time the allBirds subdirectory was
reached, we would go back to the parent path.*/

    /*If you have a situation where you need to change the default behavior and traverse
symbolic links, NIO.2 offers the FOLLOW_LINKS option as a vararg to the walk() method.
It is recommended to specify an appropriate depth limit when this option is used. Also, be
aware that when this option is used, the walk() method will track the paths it has visited,
throwing a FileSystemLoopException if a cycle is detected.*/
    }
