package B$$DesignPatternsandPrinciples.E$$WorkingwithDesignPatterns.A$$ApplyingtheSingletonPattern.ApplyingLazyInstantiationSingletons;

public class VisitorTicketTracker {
    private static VisitorTicketTracker instance;

    private VisitorTicketTracker() {
    }

    public static VisitorTicketTracker getInstance() {
        if (instance == null) {
            instance = new VisitorTicketTracker(); // NOT THREAD-SAFE!
        }
        return instance;
    }

    /*Lazy instantiation reduces memory usage and improves performance when an application
starts up*/
   /* Eclipse, often demonstrates a slight delay the first time you open a Java file in an
    editor window after starting the program. This delay disappears, though, when you open
    additional Java files. This is an example of lazy instantiation, since Eclipse is only loading
    the libraries to parse and present Java files the first time a Java file is open.*/
}