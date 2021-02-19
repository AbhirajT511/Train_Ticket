import java.time.LocalDate;
import java.util.Collection;
import java.util.Date;
import java.util.TreeMap;

public class Ticket 
{
	private int count;
	private String pnr;
	private LocalDate travelDate;
	private Train train;
	private TreeMap<Passenger, Double> passengers;



	public Ticket(LocalDate travelDate, Train train) {
		super();
		this.travelDate = travelDate;
		this.train = train;
	}


	public Ticket(int count, String pnr, LocalDate travelDate, Train train, TreeMap<Passenger, Double> passengers) {
		super();
		this.count = count;
		this.pnr = pnr;
		this.travelDate = travelDate;
		this.train = train;
		this.passengers = passengers;
	}


	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public LocalDate getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(LocalDate travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Double> getPassengers() {
		return passengers;
	}

	public void setPassengers(TreeMap<Passenger, Double> passengers) {
		this.passengers = passengers;
	}


	@Override
	public String toString() {
		return "Ticket [count=" + count + ", pnr=" + pnr + ", travelDate=" + travelDate + ", train=" + train
				+ ", passengers=" + passengers + "]";
	}

	public double generatePNR()
	{
		if(Passenger.getAge()<=12)
			return (0.5)*(train.getTicketPrice());
		else if(Passenger.getAge()>=60)
			return (0.6)*(train.getTicketPrice());
		else if(Passenger.getGender()=='F')
			return(0.25)*(train.getTicketPrice());
		else 
			return train.getTicketPrice();
	}

	double calPassengerFare(Passenger passenger)
	{
		return count;

	}

	void addPassenger(String name, int age, char gender) throws NullPointerException
	{
		passengers = new TreeMap<Passenger, Double>();
		Double fare =(double)calPassengerFare(new Passenger(name,age,gender));
		System.out.println(fare);
		passengers.put(new Passenger(name,age,gender),fare);
	}

	double calculateTotalTicketPrice()
	{
		double totalPrice = 0;
		Collection<Double> price = passengers.values();
		for(Double values:price)
		{
			totalPrice=totalPrice+values;
		}
		return (double)totalPrice;
	}

	StringBuilder generateTicket()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("PNR: "+generatePNR()).append("\n").append("Train number: "+train.getTrainNo()).append("\n").append("Train name: "+train.getTrainName());
		return null;		
	}

}
