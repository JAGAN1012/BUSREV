package busreservation;
import java.util.*;
public class busdemo {
	public static void main(String []args) {
	
	List<Bus> buses=new ArrayList<Bus>();
	List<Booking> bookings = new ArrayList<Booking>();	
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,50));
		buses.add(new Bus(3,true,56));
		System.out.println("Welcome to SRT Travles");
		int userOpt=1;
		Scanner sc =new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displaybusInfo();
		}
		
		while(userOpt==1) {
		System.out.println("Enter 1 to BookTickect and Enter 2 to exit");
		userOpt=sc.nextInt();
		if(userOpt == 1) {
			System.out.println("Booking process...");
			Booking booking = new Booking();
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your booking is confirmed");
			}
			else
				System.out.println("Sorry. Bus is full. Try another bus or date.");
		}
		}
	
		if(userOpt==2) {
			System.out.println("Thank you for yor visit");
		}
	}
		
		
	

}
