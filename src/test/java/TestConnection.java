import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {

    /**
     * host: 54.236.150.168
     * port: 1521
     * SIDE: XE
     * user: hr
     * pass: hr
     * <p>
     * jdbc url AKA connection String
     * syntax:
     * jdbc: vendorName : driverType @YourHost: PORT:SIDE
     * <p>
     * jdbc:oracle:thin:@54.236.150.168:XE
     */
    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@54.236.150.168:1521:XE";
        String username = "hr";
        String password = "hr";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("CONNECTIONS WAS SUCCESSFUL");
        } catch (SQLException e) {
            System.out.println("Connection has failed " + e.getMessage());
        }
    }
}
