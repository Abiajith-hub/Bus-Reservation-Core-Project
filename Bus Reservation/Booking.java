package busresv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengername;
	int age;
	String gender;
	double phonenumb;
	int busno;
	Date date;
	
	Booking(){
		Scanner Scanner = new Scanner(System.in);
		System.out.println(" Enter the name of the passenger: ");
		passengername = Scanner.next();
		System.out.println(" Enter the age: ");
		age= Scanner.nextInt();
		System.out.println(" Enter the gender (M/F/OTHERS) ");
		gender = Scanner.next();
		System.out.println("Enter the phone number: ");
		phonenumb = Scanner.nextDouble();
		System.out.println("Enter the bus no: ");
		busno = Scanner.nextInt();
		System.out.println("Enter the date dd-mm-yyyy");
		String dateInput = Scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}
	public boolean isAvailable(ArrayList<Booking> bookings,ArrayList<Bus> buses) {
		int capacity =0;
		for(Bus bus:buses) {
			if(bus.getbusnumber()== busno)
				capacity = bus.getcapacity();
		}
		int booked =0;
		for(Booking b:bookings) {
			if(b.busno == busno && b.date.equals(date)) {
			   booked++;
			}
	
		}
		return booked<capacity?true:false;
 }
}