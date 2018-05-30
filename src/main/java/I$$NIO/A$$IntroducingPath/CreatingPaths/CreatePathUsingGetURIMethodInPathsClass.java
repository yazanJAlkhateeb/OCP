package I$$NIO.A$$IntroducingPath.CreatingPaths;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePathUsingGetURIMethodInPathsClass {


  /*  Another way to construct a Path using the Paths class is with a URI value. A uniform
    resource identifier (URI) is a string of characters that identify a resource. It begins with
    a schema that indicates the resource type, followed by a path value. Examples of schema
    values include file:// , http:// , https:// , and ftp:// . The java.net.URI class is used to
    create and manage URI values.*/

    public static void main(String[] args) throws URISyntaxException {// THROWS EXCEPTION
        Path path1 = Paths.get(new URI("file://pandas/cuddly.png"));
        Path path2 = Paths.get(new URI("file:///c:/zoo-info/November/employees.txt"));
        Path path3 = Paths.get(new URI("file:///home/zoodirectory"));
        Path path4 = Paths.get(new URI("http://www.wiley.com"));
        Path path5 = Paths.get(
                new URI("ftp://username:password@ftp.the-ftp-server.com"));


        Path path7 = Paths.get(new URI("http://www.wiley.com"));
        URI uri4 = path7.toUri();

        /*
        Note that the constructor new URI(String) does throw a checked URISyntaxException


        we can use URI values for both local and network paths. The first example actually throws
an exception at runtime, as URIs must reference absolute paths at runtime. The URI class
does have an isAbsolute() method
         */
    }
}

