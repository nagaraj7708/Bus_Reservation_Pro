package BusResv;
import java.util.Scanner;
import java.sql.SQLException; 
import java.util.ArrayList;
public class BusDemo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
	
		BusDAO busdao = new BusDAO();
		try {
		busdao.displayBusInfo();	
		int UserOption =1;
		Scanner sc = new Scanner(System.in);
		
	
		while(UserOption==1) {
			System.out.println("Enter 1 to Book 2 to Exit");
			UserOption = sc.nextInt();
			if(UserOption==1) {
				Booking booking = new Booking();
				if(booking.isAvailable()) {
					BookingDAO bookingdao = new BookingDAO();
					bookingdao.addBooking(booking);
					System.out.println("your booking is confirmed");
				}
				else
					System.out.println("sorry bus is full. try anothor bus or date.");
			}
			}
		sc.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}