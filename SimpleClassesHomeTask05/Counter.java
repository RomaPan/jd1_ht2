package by.htp.les08.SimpleClassesHomeTask05;

public class Counter {

	private int number;
	
	//default initialisation
	Counter(){
		this.number = 12;
	}
	
	//initialisation with a set parameter
	Counter(int number){
		this.number = number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
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
		Counter other = (Counter) obj;
		if (number != other.number)
			return false;
		return true;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Counter [number=" + number + "]";
	}
}
