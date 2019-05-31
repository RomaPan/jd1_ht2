package by.htp.les08.SimpleClassesHomeTask06;

public class Time {

	private int hours;
	private int minutes;
	private int seconds;
	
	Time (){
	}
	
	Time (int hours, int minutes, int seconds){
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
	}


	public int getHours() {
		return hours;
	}


	public void setHours(int hours) {
		this.hours = hours;
	}


	public int getMinutes() {
		return minutes;
	}


	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}


	public int getSeconds() {
		return seconds;
	}


	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
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
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Time [" + hours + "h :" + minutes + "m :" + seconds + "s]";
	}
	
	
}
