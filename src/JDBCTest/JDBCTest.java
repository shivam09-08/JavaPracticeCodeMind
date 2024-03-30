package JDBCTest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	
//	 static final String DB_URL ="jdbc:mysql://localhost:3306/library";
//	 static final String USER ="root";
//	 static final String PASSWORD = "Phythan@09";
//	 static final String QUERY ="select * from library.userinfo";

	public static void main(String[] args) throws ClassNotFoundException ,SQLException {
		
		Connection connection = null;
		 PreparedStatement ps = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            
         // open a connection
            
             connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/library",
                "root", "Phythan@09");
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from library.userinfo");
            int Id;
            String UserName;
            String Password;
            
            // Extract data from result set
//            
//            while (resultSet.next()) {
//            	Id = resultSet.getInt("UserId");
//            	UserName = resultSet.getString("UserName").trim();
//            	Password = resultSet.getString("PassWord");
//                System.out.println("UserId : " + Id
//                                   + " UserName : " + UserName + " PassWord : " + Password);
//            }
            String sql = "insert into library.userinfo values('106','ram','945')";
            ps = connection.prepareStatement(sql);
            ps.execute();
           
            
            System.out.println("After Update Statement");
//            statement.executeUpdate("update library.userinfo set UserName= 'Updated Name Kartik' where UserId =102");
//            statement.executeUpdate("delete from library.userinfo where UserId =102");
            resultSet = statement.executeQuery("select * from library.userinfo");
            //Extract data After update
            
          
            
            while (resultSet.next()) {
            	Id = resultSet.getInt("UserId");
            	UserName = resultSet.getString("UserName").trim();
            	Password = resultSet.getString("PassWord");
                System.out.println("UserId : " + Id
                                   + " UserName : " + UserName + " PassWord : " + Password);
            }
            
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }

	}

}
