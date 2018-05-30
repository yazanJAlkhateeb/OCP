package J$$JDBC.D$$GettingDatafromaResultSet.GettingDataforaColumn;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getObjectMETHOD {
    static Statement stmt;

    public static void main(String[] args) throws SQLException {


        ResultSet rs = stmt.executeQuery("select id, name from species");
        while (rs.next()) {
            Object idField = rs.getObject("id");
            Object nameField = rs.getObject("name");
            if (idField instanceof Integer) {
                int id = (Integer) idField;
                System.out.println(id);
            }
            if (nameField instanceof String) {
                String name = (String) nameField;
                System.out.println(name);
            }
        }
    }
}