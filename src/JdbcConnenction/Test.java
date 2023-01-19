package JdbcConnenction;

import java.sql.*;

public class Test {

	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
//Data inserted
			/*
			 * PreparedStatement pst = con.
			 * prepareStatement("insert into mumbracentre(id,name,address) values(?,?,?)");
			 * pst.setInt(1, 121); pst.setString(2, "Ibraheem"); pst.setString(3, "Mumbai");
			 */
			
			
			
			//Data Updated and Deleted
              PreparedStatement pt=con.prepareStatement("update mumbracentre set Name='Shafique' " + " where id in(1)");
              PreparedStatement pt1=con.prepareStatement("delete from mumbracentre where id=(4)");
                  
              
			int i = pt.executeUpdate();
			 int m =pt1.executeUpdate();
			
			if(i!=0) {
				System.out.println( "successfully!!!!!!!!!!!!");

			}
			else {
				System.out.println("UnSuccessfully!!!!");
			}
			
			con.close();

			//System.out.println("Connection Establish!!!!!!!!!!!!");

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
