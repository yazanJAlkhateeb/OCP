package H$$IO.B$$IntroducingStreams.D$$CommonStreamOperations;

public class FlushingtheStream {

    /*
    When data is written to an OutputStream , the underlying operating system does not
necessarily guarantee that the data will make it to the file immediately. In many operating
systems, the data may be cached in memory, with a write occurring only after a temporary
cache is filled or after some amount of time has passed.
If the data is cached in memory and the application terminates unexpectedly, the data
would be lost, because it was never written to the file system. To address this, Java provides
a flush() method, which requests that all accumulated data be written immediately to disk.
The flush() method helps reduce the amount of data lost if the application terminates
unexpectedly. It is not without cost, though. Each time it is used, it may cause a notice-
able delay in the application, especially for large files. Unless the data that you are writing
is extremely critical, the flush() method should only be used intermittently. For example,
it should not necessarily be called after every write but after every dozen writes or so,
depending on your requirements. For reasonably small files, you may need to call flush()
only once.
     */
}
