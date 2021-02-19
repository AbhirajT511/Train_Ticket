import java.time.LocalDate;
import java.util.*;
public class TicketApplication 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		TrainDAO traindao=new TrainDAO();
		System.out.println("enter the train ID: ");
		Train train=traindao.findTrain(sc.nextInt());
		//System.out.println("price is"+train.getTicketPrice());
		System.out.println("Enter travel date: ");
		String input = sc.next();
		LocalDate travelDate = dateInput(input); 
		System.out.println("Enter number of passengers: ");
		int numberOfPassengers=sc.nextInt();
		Ticket ticket = new Ticket(travelDate,train);
		sc.hasNextLine();
		
		for(int i=1;i<=numberOfPassengers;i++)
		{
			System.out.println("Enter pasenger name: ");
			String name = sc.next();
			sc.nextLine();
			System.out.println("Enter age: ");
			int age = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Gender: ");
			String gender = sc.next();
			char gen = gender.charAt(0);
			ticket.addPassenger(name, age, gen);
		}
		System.out.println("Ticket booked with PNR: "+ticket.generatePNR());
	}

	private static LocalDate dateInput(String input) {
		// TODO Auto-generated method stub
		return null;
	}

}
