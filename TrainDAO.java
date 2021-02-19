import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class TrainDAO 
{
	public Train findTrain(int trainNumber)
	{
		String driverClass="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/TRAINS?autoReconnect=true&useSSL=false";
		String username="root";
		String password="root";
		Train train = null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,username,password);
			System.out.println("connected successfully");
			PreparedStatement ps = con.prepareStatement("select * from the statement where id = ?");
			int id = 0;
			ps.setInt(1,id);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				train = new Train(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4), rs.getInt(5));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return train;
	}
}