import java.util.Date;

public class FlightData {

	private String flightNr;
	private Date departureDate;
	private String destination;
	private String departure;
	private Date arrivalDateTime;
	private String companyName;
	public String getFlightNr() {
		return flightNr;
	}
	public FlightData(String flightNr, Date departureDate, String destination, String departure, Date arrivalDateTime,
			String companyName) {
		super();
		this.flightNr = flightNr;
		this.departureDate = departureDate;
		this.destination = destination;
		this.departure = departure;
		this.arrivalDateTime = arrivalDateTime;
		this.companyName = companyName;
	}
	public void setFlightNr(String flightNr) {
		this.flightNr = flightNr;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public Date getArrivalDateTime() {
		return arrivalDateTime;
	}
	public void setArrivalDateTime(Date arrivalDateTime) {
		this.arrivalDateTime = arrivalDateTime;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
