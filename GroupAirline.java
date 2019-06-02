package by.htp.les08.SimpleClassesHomeTask10;


import java.util.ArrayList;
import java.util.List;

public class GroupAirline {
	private ArrayList<Airline> groupAirline;
	
	
	public GroupAirline() {
		this.groupAirline = new ArrayList<Airline>();
	}
	
	public List<Airline> addAirline(Airline airline){
		groupAirline.add(airline);
		
		return groupAirline;
	}

	@Override
	public String toString() {
		System.out.println("Group of airlines: ");
		for (int i = 0; i<groupAirline.size(); i++) {
			System.out.println(groupAirline.get(i));
		}
		return   "";
	}

	public ArrayList<Airline> getGroupAirline() {
		return groupAirline;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupAirline == null) ? 0 : groupAirline.hashCode());
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
		GroupAirline other = (GroupAirline) obj;
		if (groupAirline == null) {
			if (other.groupAirline != null)
				return false;
		} else if (!groupAirline.equals(other.groupAirline))
			return false;
		return true;
	}
	
	
}
