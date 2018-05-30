package J$$JDBC.D$$GettingDatafromaResultSet;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class GetCoulmnByName {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("");
        Statement statement = connection.createStatement();
        Map<Integer, String> idToNameMap = new HashMap<>();
        ResultSet rs = statement.executeQuery("select id, name from species");
        while(rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            idToNameMap.put(id, name);
        }
        System.out.println(idToNameMap); // {1=African Elephant, 2=Zebra}
/*the cursor starts out pointing to the
location before the ResultSet . On the first loop iteration, rs.next() returns true and the
cursor moves to point to the first row of data. On the second loop iteration, rs.next()
returns true again and the cursor moves to point to the second row of data. The next
call to rs.next() returns false . The cursor advances past the end of the data. The false
signifies that there is no data available to get.*/
    }
}
