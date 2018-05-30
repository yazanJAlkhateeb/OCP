package F$$ExceptionsAndAssertions.D$$UsingTryWithResources.AutoCloseable;

public class AutoCloseableVSCloseable {
    /*
    * The AutoCloseable interface was introduced in Java 7. Before that, another interface
existed called Closeable . It was similar to what the language designers wanted, with the
following exceptions:

■ ■ Closeable restricts the type of exception thrown to IOException
.
■ ■ Closeable requires implementations to be idempotent.

The language designers emphasize backward compatibility. Since changing the exist-
ing interface was undesirable, they made a new one called AutoCloseable . This new
interface is less strict than Closeable . Since Closeable meets the requirements for
AutoCloseable , it started implementing AutoCloseable when the latter was introduced.*/
}
