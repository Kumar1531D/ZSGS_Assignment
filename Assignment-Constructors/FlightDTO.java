package assignment_Constructors;

public class FlightDTO {

	public static void main(String[] args) {
		
		Flight flight = new Flight("DK1531","PM","CHENNAI","LONDON","15:00","01:03","Passenger Flight",500);
		System.out.println(flight.getDetails());
	}

}

class Flight{
	private String flightNumber;
	private String airline;
	private String departureAirport;
	private String arrivalAirport;
	private String departureTime;
	private String arrivalTime;
	private String flightType;
	private int availableSeatCount;
	
	private final String DEFAULT_DEPARTURE_AIRPORT = "DELHI";
	private final String DEFAULT_ARRIVAL_AIRPORT = "CHENNAI";
	private final String DEFAULT_FLIGHT_TYPE = "PASSENGER FLIGHT";
	
	Flight(){
		this.flightNumber = "ABC123";
		this.airline = "AIR INDIA";
		this.departureAirport = DEFAULT_DEPARTURE_AIRPORT;
		this.arrivalAirport = DEFAULT_ARRIVAL_AIRPORT;
		this.departureTime = "00:00";
		this.arrivalTime = "12:00";
		this.flightType = DEFAULT_FLIGHT_TYPE;
		this.availableSeatCount = 300;
	}
	
	Flight(String flightNumber,String airline,String departureAirport,String arrivalAirport,String departureTime,String arrivalTime,String flightType,int availableSeatCount){
		this.flightNumber = flightNumber;
		this.airline = airline;
		this.departureAirport = departureAirport;
		this.arrivalAirport =arrivalAirport;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.flightType = flightType;
		this.availableSeatCount = availableSeatCount;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getAvailableSeatNo() {
		return availableSeatCount;
	}

	public void setAvailableSeatNo(int availableSeatNo) {
		this.availableSeatCount = availableSeatNo;
	}

	public String getDEFAULT_DEPARTURE_AIRPORT() {
		return DEFAULT_DEPARTURE_AIRPORT;
	}

	public String getDEFAULT_ARRIVAL_AIRPORT() {
		return DEFAULT_ARRIVAL_AIRPORT;
	}

	public String getDetails() {
		return "\nFlightNumber :" + flightNumber + 
				"\nAirline : " + airline + 
				"\nDepartureAirport : " + departureAirport + 
				"\nArrivalAirport : " + arrivalAirport + 
				"\nDepartureTime : " + departureTime+ 
				"\nArrivalTime : " + arrivalTime + 
				"\nFlight Type : "+flightType+ 
				"\nAvailableSeatCount : " + availableSeatCount;
	}
	
	
	
}
