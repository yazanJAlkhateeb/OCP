package J$$JDBC.C$$ObtainingaStatement;

public class ChoosingaResultSetConcurrencyMode {
    /*default, a ResultSet is in CONCUR_READ_ONLY mode. This is what you need most
of the time. It means that you can’t update the result set. Most of the time, you will
use INSERT , UPDATE , or DELETE SQL statements to change the database rather than a
ResultSet .
There is one other mode that you can request when creating a Statement .
Unsurprisingly, it lets you modify the database through the ResultSet . It is called
CONCUR_UPDATABLE .



You have to know read-only mode in detail for the exam. For updat-
able, you only have to know the name and that it is not universally
supported.*/

    /*Again, if the mode you request isn’t available, the driver can downgrade you. This
means that if you ask for CONCUR_UPDATABLE , you will likely get a Statement that is
CONCUR_READ_ONLY .*/
}
