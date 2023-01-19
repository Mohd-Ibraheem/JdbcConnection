package JdbcConnection;
import java.sql.*;
public class UpdateQuery {
      public static void main(String[] args) {
		
    	  try {
    		  
    		  
    		  Class.forName("com.mysql.jdbc.Driver");
  			Connection con=DriverManager.getConnection
  					("jdbc:mysql://localhost:3306/emp","root","root");
  			Statement st=con.createStatement();
  			String query="update ibraheem set Name='Sarfaraz' " + "where id in(1,4)";
  			st.executeUpdate(query);
  			System.out.println("update successfully");
    		  
    		  
    	  }catch (Exception e) {
			System.out.println(e);
			}
    	  
	}
}
