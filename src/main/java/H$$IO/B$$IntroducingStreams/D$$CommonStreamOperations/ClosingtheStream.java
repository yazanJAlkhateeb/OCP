package H$$IO.B$$IntroducingStreams.D$$CommonStreamOperations;

public class ClosingtheStream {

    /*
    Since streams are considered resources, it is imperative that they be closed after they
are used lest they lead to resource leaks. As you saw in Chapter 6, “Exceptions and
AssertionsSample,” you can accomplish this by calling the close() method in a finally block or
using the try-with-resource syntax.
In a file system, failing to close a file properly could leave it locked by the operating
system such that no other processes could read/write to it until the program is terminated.
Throughout this chapter, we will close stream resources using the try-with-resource syntax,
since this is the preferred way of closing resources in Java
     */
}
