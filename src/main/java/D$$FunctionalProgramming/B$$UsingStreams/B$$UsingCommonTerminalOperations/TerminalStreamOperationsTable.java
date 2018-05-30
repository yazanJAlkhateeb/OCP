package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations;

public class TerminalStreamOperationsTable {
    //Method         What Happens for Infinite Streams   Return Value   Reduction
    //allMatch()
    ///anyMatch()
    ///noneMatch()  Sometimes terminates                     boolean      No
    //collect()     Does not terminate                          Varies   Yes
    //count()       Does not terminate                          long    Yes
    //findAny()
    ///findFirst()  Terminates                              Optional<T> No
    //forEach()     Does not terminate                          void No
    //min()/max()   Does not terminate                      Optional<T> Yes
    //reduce()      Does not terminate                          Varies Yes
}
