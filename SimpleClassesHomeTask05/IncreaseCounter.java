package by.htp.les08.SimpleClassesHomeTask05;

public class IncreaseCounter {


	public Counter increaseNumber(Counter number) {
		int temp = number.getNumber() + 1;
		number.setNumber(temp);
		return number;
	}

	public Counter increaseNumber(Counter number, int customIncreaseNumber) {
		int temp = number.getNumber() + customIncreaseNumber;
		number.setNumber(temp);
		return number;
	}
}

