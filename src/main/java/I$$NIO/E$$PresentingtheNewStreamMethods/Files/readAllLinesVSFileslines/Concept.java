package I$$NIO.E$$PresentingtheNewStreamMethods.Files.readAllLinesVSFileslines;

public class Concept{
/*
    For the exam, you should be familiar with both readAllLines() and lines() and with
    which one returns a List and which one returns a Stream . This is even more difficult
    since the forEach() method can be called on both Stream and Collection objects. For
    example, both of the following lines compile and run without issue:
            Files.readAllLines(Paths.get("birds.txt")).forEach(System.out::println);

Files.lines(Paths.get("birds.txt")).forEach(System.out::println);
    The first code snippet reads the entire file into memory and then performs a print
    operation on the resulting object. The second code snippet reads the lines lazily and
    prints them as they are being read. The advantage of the second code snippet is that it
    does not require the entire file to be stored in memory as it is being read.
    You should also be aware of when they are mixing incompatible types on the exam. For
    example, can you determine which of the following two lines compiles?
            Files.readAllLines(path).filter(s -> s.length()>2).forEach(System.out::println);

Files.lines(path).filter(s -> s.length()>2).forEach(System.out::println);
    The first line does not compile because the filter() operation cannot be applied to a
    Collection without first converting it to a Stream using the stream() method.
*/
}
