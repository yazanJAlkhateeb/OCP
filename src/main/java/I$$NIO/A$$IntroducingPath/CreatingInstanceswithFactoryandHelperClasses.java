package I$$NIO.A$$IntroducingPath;

public class CreatingInstanceswithFactoryandHelperClasses {

    /*
    The NIO.2 API makes good use of the factory pattern as discussed in Chapter 2, “Design
Patterns and Principles.” Remember that a factory class can be implemented using static
methods to create instances of another class. For example, you can create an instance of a
Path interface using a static method available in the Paths factory class. Note the s at the
end of the Paths class to distinguish it from the Path interface.

Why Is Path an Interface?
You might be wondering, “If Path is the primary NIO.2 entry point, why don’t I call a
Path constructor directly?” The reason why Path is an interface and not a class is that
creating a file or directory is considered a file system–dependent task in NIO.2. When
you obtain a Path object from the default file system in NIO.2, the JVM gives you back
an object that unlike java.io.File transparently handles system-specific details for
the current platform.
     */
}
