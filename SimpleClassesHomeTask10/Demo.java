package by.htp.les08.SimpleClassesHomeTask10;

public class Demo {

	public static void main(String[] args) {
		
		Airline airline1 = new Airline("Paris",123,"Airbus",7.00,"Tuesday");
		
		Airline airline2 = new Airline("New York",453,"Boeing",16.00,"Sunday");
		Airline airline3 = new Airline("Dublin",190,"Bombardier",12.00,"Wednesday");
		Airline airline4 = new Airline("Copenhagen",220,"Airbus",09.00,"Tuesday");
		Airline airline5 = new Airline("Dallas",87,"Embraer",19.00,"Monday");
		Airline airline6 = new Airline("Portland",678,"Airbus",11.00,"Monday");
		Airline airline7 = new Airline("Montreal",345,"Airbus",12.00,"Tuesday");
		Airline airline8 = new Airline("Toronto",909,"Bombardier",10.00,"Friday");
		Airline airline9 = new Airline("Dallas",021,"Airbus",13.00,"Thursday");
		Airline airline10 = new Airline("Dublin",345,"Boeing",23.00,"Friday");
		
		GroupAirline grAirline = new GroupAirline();
		grAirline.addAirline(airline1);
		grAirline.addAirline(airline2);
		grAirline.addAirline(airline3);
		grAirline.addAirline(airline4);
		grAirline.addAirline(airline5);
		grAirline.addAirline(airline6);
		grAirline.addAirline(airline7);
		grAirline.addAirline(airline8);
		grAirline.addAirline(airline9);
		grAirline.addAirline(airline10);
		
		System.out.println(grAirline);
		
		GroupSortLogic grSorted = new GroupSortLogic();
		grSorted.sortByDestination(grAirline, "Dallas");
		System.out.println("Flights available for given destination: ");
		System.out.println(grSorted);
		
		
		grSorted.sortByDayOfTheWeek(grAirline, "Tuesday");
		System.out.println("Flights available for given day of the week: ");
		System.out.println(grSorted);
		
		
		grSorted.sortByDayOfTheWeekAndTime(grAirline, "Tuesday", 8.00);
		System.out.println("Sorted by day and time: ");
		System.out.println(grSorted);
	}

}
