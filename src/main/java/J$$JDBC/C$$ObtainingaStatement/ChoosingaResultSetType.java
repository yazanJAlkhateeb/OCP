package J$$JDBC.C$$ObtainingaStatement;

public class ChoosingaResultSetType {

    /*By default, a ResultSet is in TYPE_FORWARD_ONLY mode. This is what you need most of the
time. You can go through the data once in the order in which it was retrieved.
Two other modes that you can request when creating a Statement are TYPE_SCROLL_
INSENSITIVE and TYPE_SCROLL_SENSITIVE . Both allow you to go through the data in any
order. You can go both forward and backward. You can even go to a specifi c spot in the
data. Think of this like scrolling in a browser. You can scroll up and down. You can go to a
specifi c spot in the result.
The difference between TYPE_SCROLL_INSENSITIVE and TYPE_SCROLL_SENSITIVE is what
happens when data changes in the actual database while you are busy scrolling. With TYPE_
SCROLL_INSENSITIVE , you have a static view of what the ResultSet looked like when you
did the query. If the data changed in the table, you will see it as it was when you did the
query. With TYPE_SCROLL_SENSITIVE , you would see the latest data when scrolling through
the ResultSet .*/

    /*ou have to know forward only and scroll insensitive in detail for the exam.
For scroll sensitive, you only have to know the name and that it isn’t well
supported. You don’t need to read or write code with it*/

    /*ou are almost guaranteed never to use in practice.
If the type you request isn’t available, the driver can “helpfully” downgrade to one that
is. This means that if you ask for TYPE_SCROLL_SENSITIVE , you will likely get a Statement
that is TYPE_SCROLL_INSENSITIVE . Isn’t that great? If you’d wanted insensitive, you’d have
asked for that in the fi rst place!
Table 10.2 sums up what you need to know about the ResultSet types.
Ta B l e   1 0 . 2
ResultSet type options
ResultSet Type  See Latest Data from
Database Table Supported by Most
Drivers
ResultSet.TYPE_     Can Go Backward
FORWARD_ONLY No No Yes
ResultSet.TYPE_
SCROLL_INSENSITIVE Yes No Yes
ResultSet.TYPE_
SCROLL_SENSITIVE Yes Yes No*/
}
