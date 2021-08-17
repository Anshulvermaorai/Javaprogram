package program;
import java.sql.*;
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try{  
                       //Make sure to add the mysql-connector-java-8.0.26.jar in the external jars
			Class.forName("com.mysql.cj.jdbc.Driver");  

			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/demo","root","Root");  
			//here demo is database name, root is username and password  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from movies");  
			System.out.println();
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getDate(6).toLocalDate());  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
	}

}
