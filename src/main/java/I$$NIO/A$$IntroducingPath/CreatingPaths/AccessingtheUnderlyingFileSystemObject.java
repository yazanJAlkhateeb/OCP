package I$$NIO.A$$IntroducingPath.CreatingPaths;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class AccessingtheUnderlyingFileSystemObject {
    public static void main(String[] args) throws URISyntaxException {
            /*
The Paths.get(WhatEver) method used throughout the previous examples is actually short-
hand for the class java.nio.file.FileSystem method getPath() . The FileSystem class
has a protected constructor, so we use the plural FileSystems factory class to obtain an
instance of FileSystem , as shown in the following example code:
*/
//        Path path1 = FileSystems.getDefault().getPath("pandas/cuddly.png");
//        Path path2 = FileSystems.getDefault().getPath("c:", "zooinfo", "November",
//                "employees.txt");
//        Path path3 = FileSystems.getDefault().getPath("/home/zoodirector");

      /*  While most of the time we want access to a Path object that is within the local file system,
                the FileSystems factory class does give us the ability to connect to a remote file system, as
                shown in the following sample code:*/
        FileSystem fileSystem = FileSystems.getFileSystem(
                new URI("https://www.briefmenow.org/"));
        Path path = fileSystem.getPath("/");
        System.out.println(path.toAbsolutePath());


    }
}
