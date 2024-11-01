package classAndObjects;

public class FlightDTO {
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
	
	public String getDefaultValues() {
		return "DEFAULT_FLIGHT_TYPE : "+DEFAULT_FLIGHT_TYPE+
				"\nDEFAULT_DEPARTURE_AIRPORT : "+DEFAULT_DEPARTURE_AIRPORT+
				"\nDEFAULT_ARRIVAL_AIRPORT : "+DEFAULT_ARRIVAL_AIRPORT;
				
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
