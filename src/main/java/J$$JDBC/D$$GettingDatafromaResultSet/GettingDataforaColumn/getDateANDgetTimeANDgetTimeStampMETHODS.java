package J$$JDBC.D$$GettingDatafromaResultSet.GettingDataforaColumn;

public class getDateANDgetTimeANDgetTimeStampMETHODS {
    /*
    * we want to know what date Elsa the
elephant was born:
ResultSet rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
if (rs.next()) {
java.sql.Date sqlDate = rs.getDate(1);
LocalDate localDate = sqlDate.toLocalDate();
System.out.println(localDate); // 2001―05―06
}

When calling getDate , JDBC returns just the date part of the value. This is the year,
month, and date. It returns a java.sql.Date object. This is an older class, but Java 8 adds
a method to convert it to the new LocalDate type.528

 ---------------------------
Now we want to know what time of day Elsa was born:
ResultSet rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
if (rs.next()) {
java.sql.Time sqlTime = rs.getTime(1);
LocalTime localTime = sqlTime.toLocalTime();
System.out.println(localTime); // 02:15
}
When calling getTime , JDBC returns just the time part of the value. This is the hours
and minutes. It also optionally includes more granular pieces like seconds. Finally, let’s
suppose that we want to know both the date and time when Elsa was born:

---------------------------
ResultSet rs = stmt.executeQuery("select date_born from animal where name = 'Elsa'");
if (rs.next()) {
java.sql.Timestamp sqlTimeStamp = rs.getTimestamp(1);
LocalDateTime localDateTime = sqlTimeStamp.toLocalDateTime();
System.out.println(localDateTime); // 2001―05―06T02:15
}*/
}
