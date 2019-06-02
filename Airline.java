package by.htp.les08.SimpleClassesHomeTask10;

public class Airline {
	private String destination;
	private int flightNumber;
	private String airplaneType;
	private double departureTime;
	private String dayOfTheWeek;
	
	public Airline(String destination, int flightNumber, String airplaneType, double departureTime,String dayOfTheWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.airplaneType = airplaneType;
		this.departureTime = departureTime;
		this.dayOfTheWeek = dayOfTheWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getAirplaneType() {
		return airplaneType;
	}

	public void setAirplaneType(String airplaneType) {
		this.airplaneType = airplaneType;
	}

	public double getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(double departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}

	public void setDayOfTheWeek(String dayOfTheWeek) {
		this.dayOfTheWeek = dayOfTheWeek;
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airplaneType == null) ? 0 : airplaneType.hashCode());
		result = prime * result + ((dayOfTheWeek == null) ? 0 : dayOfTheWeek.hashCode());
		long temp;
		temp = Double.doubleToLongBits(departureTime);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + flightNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airline other = (Airline) obj;
		if (airplaneType == null) {
			if (other.airplaneType != null)
				return false;
		} else if (!airplaneType.equals(other.airplaneType))
			return false;
		if (dayOfTheWeek == null) {
			if (other.dayOfTheWeek != null)
				return false;
		} else if (!dayOfTheWeek.equals(other.dayOfTheWeek))
			return false;
		if (Double.doubleToLongBits(departureTime) != Double.doubleToLongBits(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + destination + ", " + flightNumber + ", "
				+ airplaneType + ", " + departureTime + ", " + dayOfTheWeek + "]";
	}
	
	
	
}
