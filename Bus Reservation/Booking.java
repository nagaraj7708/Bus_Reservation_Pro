package BusResv;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Booking {
	String PassengerName;
	int BusNo;
	Date date ;
	
	Booking(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		PassengerName = sc.next();
		System.out.println("Enter Bus No: ");
		BusNo = sc.nextInt();
		System.out.println("Enter the Date dd-mm-yyyy");
		String dateInput = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		sc.close();
		}
	public boolean isAvailable()throws SQLException {
		
		BusDAO busdao = new BusDAO();
		BookingDAO bookingdao = new BookingDAO();
		int Capacity= busdao.getCapacity(BusNo);
		
		int booked = bookingdao.getBokedCount(BusNo,date);
		
		return booked<Capacity;
	}
}
