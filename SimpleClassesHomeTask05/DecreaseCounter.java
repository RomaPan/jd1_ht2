package by.htp.les08.SimpleClassesHomeTask05;

public class DecreaseCounter {

	
	public Counter decreaseNumber(Counter number) {
		int temp = number.getNumber() - 1;
		number.setNumber(temp);
		return number;
	}
	
	public Counter decreaseNumber(Counter number, int customDecreaseNumber) {
		int temp = number.getNumber() - customDecreaseNumber;
		number.setNumber(temp);
		return number;
	}
}
