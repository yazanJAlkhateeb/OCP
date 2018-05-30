package J$$JDBC.B$$ConnectingtoaDatabase;
/*nside the java.sql.Driver file is one line. It is the fully qualified package name of the
Driver implementation class*/
public class HowDriverManagerGetTheRightJAR {
    /*
    The DriverManager class looks through the classpath for JARs that contain a Driver .
DriverManager knows that a JAR is a driver because it contains a file called java.sql.Driver
     */

    /*
    in the directory META-INF/services . In other words, a driver might contain this information:
META-INF
−service
―java.sql.Driver

com
−wiley
―MyDriver.class
     */
}
