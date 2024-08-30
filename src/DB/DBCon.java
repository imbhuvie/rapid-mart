package DB;

/**
 * @author bhupendraVerma
 */
import java.sql.*;

public class DBCon {

    public Connection con;
    public Statement stmt;
    public PreparedStatement pstmt;
    public ResultSet rst;

    public DBCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3310/rapid_mart", "root", "root");
//            System.out.println("Connection :=>"+connection);
        } catch (Exception e) {
            System.out.println("not done");
            e.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        DBCon con=new DBCon();
//        
//    }
}
