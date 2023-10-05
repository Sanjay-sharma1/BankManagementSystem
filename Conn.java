import java.sql.*;

public class Conn {
    Connection c ;
    Statement s ;

    public Conn(){

        // String jdbcUrl = "jdbc:mysql://localhost:3306/bankmanagmentsystem?serverTimezone=UTC";
        // String username = "root";
        // String password = "S@G@R2417";

        // Connection c = null;
        // Statement s = null;

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "S@G@R2417");
            s = c.createStatement();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
