package by.htp.les08.SimpleClassesHomeTask06;
public class TimeLogic {

	public Time setNewTime(Time time, int newHours, int newMinutes, int newSeconds) {
		int h = time.getHours() + newHours;
		int m = time.getMinutes() + newMinutes;
		int s = time.getSeconds() + newSeconds;
		
		time.setHours(h);
		time.setMinutes(m);
		if ( m >= 60 ) {
			time.setMinutes(0);
		}
		time.setSeconds(s);
		if (s >= 60 ) {
			time.setSeconds(0);
		}
		
		return time;
		
	}
	
	public Time setNewSeconds(Time time, int newSeconds) {
		int s = time.getSeconds() + newSeconds;
		
		time.setSeconds(s);
		if (s >= 60 ) {
			time.setSeconds(0);
		}
		
		return time;
		
	}
	
	public Time setNewMinutes(Time time, int newMinutes) {
		int m = time.getMinutes() + newMinutes;
		
		time.setMinutes(m);
		if ( m >= 60 ) {
			time.setMinutes(0);
		}
		
		return time;
		
	}
	
	public Time setNewHours(Time time, int newHours) {
		int h = time.getHours() + newHours;
		time.setHours(h);
		return time;
		
	}

}
