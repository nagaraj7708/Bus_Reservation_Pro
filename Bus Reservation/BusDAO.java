package BusResv;

import java.sql.*;

public class BusDAO {
	public void displayBusInfo() throws SQLException{
		String Queary = "Select * from bus";
		Connection con = DBconnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Queary);
		
		while(rs.next()) {
			System.out.println("Bus No: "+rs.getInt(1));
			if(rs.getInt(2)==0)
				System.out.println("AC: No");
			else
				System.out.println("AC: Yes");
			System.out.println("Capacity: "+rs.getInt(3));
		}
		System.out.println("---------------------------");
	}
	
	public int getCapacity(int id) throws SQLException{
		String Query = "select Capacity from bus where id="+id;
		Connection con = DBconnection.getConnection();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(Query);
		rs.next();
		return rs.getInt(1);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
