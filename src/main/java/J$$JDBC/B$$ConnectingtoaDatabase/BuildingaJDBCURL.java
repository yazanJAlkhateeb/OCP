package J$$JDBC.B$$ConnectingtoaDatabase;

public class BuildingaJDBCURL {
    /*
    The first piece is always the same. It is the protocol jdbc . The second
part is the name of the database such as derby , mysql , or postgres . The third part is “the
rest of it,” which is a database-specific format. Colons separate the three parts.
     */

    /*
    Other examples are shown here:
jdbc:postgresql://localhost/zoo
jdbc:oracle:thin:@123.123.123.123:1521:zoo
jdbc:mysql://localhost:3306/zoo?profileSQL=true
     */

    /*
    To make sure you get this, do you see what is wrong with each of the following?
jdbc:postgresql://local/zoo
jdbc:mysql://123456/zoo
jdbc;oracle;thin;/localhost/zoo
The first one uses local instead of localhost . localhost is a specially defined name.
You can’t just make up a name. Granted, it is possible for our database server to be named
local, but the exam won’t have you assume names. If the database server has a specialConnecting to a Database
name, the question will let you know it. The second one says that the location of the
database is 123456 . This doesn’t make sense. A location can be localhost or an IP address
or a domain name. It can’t be any random number. The third one is no good because it uses
semicolons instead of colons.
     */
}
