package by.htp.les08.SimpleClassesHomeTask10;

import java.util.ArrayList;
import java.util.List;

public class GroupSortLogic {
	private ArrayList<Airline> sortedGroup;
	
	public GroupSortLogic() {
		this.sortedGroup = new ArrayList<Airline>();
	}
	
	
	public List<Airline> sortByDestination(GroupAirline group, String destination){
		this.sortedGroup = new ArrayList<Airline>();
		
		String temp = "";
		
		for (int i = 0; i < group.getGroupAirline().size(); i++) {
			temp = group.getGroupAirline().get(i).getDestination();
			if (temp.contains(destination)) {
				sortedGroup.add(group.getGroupAirline().get(i));
			}
		}
		return sortedGroup;
	}
	
	
	public List<Airline> sortByDayOfTheWeek(GroupAirline group, String weekday){
		this.sortedGroup = new ArrayList<Airline>();
		
		String temp = "";
		
		for (int i = 0; i < group.getGroupAirline().size(); i++) {
			temp = group.getGroupAirline().get(i).getDayOfTheWeek();
			if (temp.contains(weekday)) {
				sortedGroup.add(group.getGroupAirline().get(i));
			}
		}
		return sortedGroup;
	}
	
	
	public List<Airline> sortByDayOfTheWeekAndTime(GroupAirline group, String weekday, double time){
		this.sortedGroup = new ArrayList<Airline>();
		
		String temp = "";
		double tempTime;
		
		for (int i = 0; i < group.getGroupAirline().size(); i++) {
			temp = group.getGroupAirline().get(i).getDayOfTheWeek();
			tempTime = group.getGroupAirline().get(i).getDepartureTime();
			if (temp.contains(weekday)) {
				if (tempTime>time) {
					sortedGroup.add(group.getGroupAirline().get(i));
				} 
			}
		}
		return sortedGroup;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sortedGroup == null) ? 0 : sortedGroup.hashCode());
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
		GroupSortLogic other = (GroupSortLogic) obj;
		if (sortedGroup == null) {
			if (other.sortedGroup != null)
				return false;
		} else if (!sortedGroup.equals(other.sortedGroup))
			return false;
		return true;
	}


	public ArrayList<Airline> getSortedGroup() {
		return sortedGroup;
	}


	@Override
	public String toString() {
		for (int i = 0; i < sortedGroup.size(); i++) {
			System.out.println(sortedGroup.get(i));
		}
		
		return "";
	}
	
	
	
	
}
