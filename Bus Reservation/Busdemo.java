package busresv;

import java.util.Scanner;
import java.util.ArrayList;
public class Busdemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		buses.add(new Bus(1,true,1));
		buses.add(new Bus(2,true,45));
		buses.add(new Bus(3,false,60));
		buses.add(new Bus(4,false,50));
		buses.add(new Bus(5,true,45));
		
		
		int useropt = 1;
		Scanner Scanner = new Scanner(System.in);
		
		for(Bus b:buses) {
			b.displayBusinfo();
		}
		while (useropt==1) {
			System.out.println("enter 1 to book 2 to exit");
			useropt = Scanner.nextInt();
			if (useropt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("your booking is confirmed");
				}
				else
					System.out.println("sorry. seat full,try another bus. ");
			}
		}
	}
 }



