import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import org.junit.runners.model.Statement;

public class Query01 {
    public static void main(String[] args) throws ClassNotFoundException {

        // install driver
        Class.forName("com.mysql.jdbc.Driver");

        // create link
        Connection con; // = DriverManager.getConnection(
        //  url: "jdbc:mysql://localhost:3306/database", user: "root", password: "1234");

        // create an obj
        Statement statement; // = con.createStatement();

        // result set
        Resultset data;
        // statement.executeQuery(sql: "select * from ...");

        // get result

        // while( data.next()){
        //  System.out.println(data.getInt(columnIndex: 1)+ data.getStrint(columnIndex: 2));
        // }

        // Column label can be used instead of column index


    }
}
