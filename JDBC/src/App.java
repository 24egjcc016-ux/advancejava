import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college", "root", "luffy");
        PreparedStatement ps = con.prepareStatement("insert into student values(?, ?, ?, ?, ?)");
        ps.setInt(1, 1);
        ps.setString(2, "luffy");
        ps.setString(3, "999"); // roll number
        ps.setString(4, "Cyber"); // branch
        ps.setString(5, "Male"); // gender
        System.out.println("Data inserted successfully");
        ps.executeUpdate();
        con.close();
    }
}
