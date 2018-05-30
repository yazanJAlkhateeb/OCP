package B$$DesignPatternsandPrinciples.E$$WorkingwithDesignPatterns.A$$ApplyingtheSingletonPattern;

public class SingletonsDoubleCheckedLocking {
   /* The synchronized implementation of getInstance(), while correctly preventing multiple
    singleton objects from being created, has the problem that every single call to this
    method will require synchronization. In practice, this can be costly and can impact
    performance. Synchronization is only needed the first time that the object is created.
    The solution is to use double‐checked locking, a design pattern in which we first test if
    synchronization is needed before actually acquiring any locks. The following is an exam-
    ple rewrite of this method using double‐checked locking:
    private static volatile VisitorTicketTracker instance;
    public static VisitorTicketTracker getInstance() {
        if(instance == null) {
            synchronized(VisitorTicketTracker.class) {
                if(instance == null) {
                    instance = new VisitorTicketTracker();
                }
            }
        }
        return instance;
    }
    As you may have noticed, we added the volatile modifier to our singleton object. This
    keyword prevents a subtle case where the compiler tries to optimize the code such that
    that the object is accessed before it is finished being constructed. For the exam, you are
    not required to know how volatile works or about any compiler optimizations.82

    This solution is better than our previous version, as it performs the synchronization
    step only when the singleton does not exist. If our singleton is accessed thousands of
    times over many hours or days, this means that only the fi rst few calls would require
    synchronization, and the rest would not.*/
}
