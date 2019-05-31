package by.htp.les08.SimpleClassesHomeTask06;

public class Demo {

	public static void main (String [] args) {
		
		Time time1 = new Time(0,0,0);	
		
		TimeLogic tLogic = new TimeLogic();
		
		System.out.println(tLogic.setNewTime(time1, 0, 0, 0));
		System.out.println(tLogic.setNewTime(time1, 1, 10, 10));
		System.out.println(tLogic.setNewTime(time1, 0, 0, 180));
		System.out.println(tLogic.setNewTime(time1, 7, 59, 59));
		System.out.println(tLogic.setNewTime(time1, 0, 1, 1));
		
		
		System.out.println(tLogic.setNewHours(time1, 1));
		System.out.println(tLogic.setNewMinutes(time1, 2));
		System.out.println(tLogic.setNewSeconds(time1, 20));
		
	}

}
