package J$$JDBC;

public class ClosingDatabaseResources {
    /*
    * While it is a good habit to close all three resources, it isn’t strictly necessary. Closing a
JDBC resource should close any resources that it created. In particular, the following are
true:
■ ■ Closing a Connection also closes the Statement and ResultSet .
■ ■ Closing a Statement also closes the ResultSet .*/

    /*There’s another way to close a ResultSet . JDBC automatically closes a ResultSet when
you run another SQL statement from the same Statement*/
}
