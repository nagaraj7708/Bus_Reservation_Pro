package BusResv;
import java.util.Date;
import java.sql.*;
//import java.sql.*;
public class BookingDAO {
	public int getBokedCount(int BusNo,Date date) throws SQLException{
		String Query = "select count(Passenger_Name) from booking where Bus_No=?  and Travel_Data=?";
		Connection con = DBconnection.getConnection();
		PreparedStatement pst = con.prepareStatement(Query);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		pst.setInt(1, BusNo);
		pst.setDate(2, sqldate);
		ResultSet rs = pst.executeQuery();
		rs.next();
		return rs.getInt(1);
		
	}
	public void addBooking(Booking booking) throws SQLException{
		String query = "insert into booking values(?,?,?)";
		Connection con = DBconnection.getConnection();
		
		java.sql.Date sqldate = new java.sql.Date(booking.date.getTime());
		PreparedStatement pst = con.prepareStatement(query);
		pst.setString(1, booking.PassengerName);
		pst.setInt(2, booking.BusNo);
		pst.setDate(3, sqldate);
		
		pst.executeUpdate();
		
	}
	
	
	
	
	
	
	
	
	

}
