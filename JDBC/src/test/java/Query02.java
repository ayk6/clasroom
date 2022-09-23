import com.mysql.cj.protocol.Resultset;
import com.sun.jdi.connect.spi.Connection;
import org.junit.runners.model.Statement;

public class Query02 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class.forName("com.mysql.jdbc.Driver");

        // create link
        Connection con; // = DriverManager.getConnection(
        //  url: "jdbc:mysql://localhost:3306/database", user: "root", password: "1234");

        // create an obj
        Statement statement; // = con.createStatement();

        // get data from database
        Resultset data ; //=
        //    statement.executeQuery("select * from ... where ... = '...'");

       // while (data.next()){
       //     System.out.println(data.getInt(columnIndex: 1));
       // }
    }
}
