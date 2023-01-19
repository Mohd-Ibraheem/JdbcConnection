package JdbcConnection;
import java.sql.*;
import java.util.Scanner;
public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
		
		try {
			
			System.out.println("enter the id:");
			String id=sc.next();
			System.out.println("enter the name:");
			String name =sc.next();
			System.out.println("enter the address");
			String address=sc.next();
			
			//Connetion
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection
					("jdbc:mysql://localhost:3306/emp","root","root");
			PreparedStatement pt=con.prepareStatement("insert into ibraheem(id,name,address) values(?,?,?)");
			//PreparedStatement pt=con.prepareStatement("update ibraheem set name=(?) where name=(?)");
			   pt.setString(1, id);
			   pt.setString(2, name);
			   pt.setString(3, address);
			   
			   int i=pt.executeUpdate();
			   if(i!=0) {
				   System.out.println("Data inserted successfully");
			   }else {
				   System.out.println("Data not inserted");
			   }
			
		
		}catch (Exception e) {
			System.out.println(e);
		}
	}//whileloop
	
	}
}
