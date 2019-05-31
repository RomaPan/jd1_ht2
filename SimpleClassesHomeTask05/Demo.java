package by.htp.les08.SimpleClassesHomeTask05;

public class Demo {

	
	
	public static void main (String[] args) {
		
		Counter counter1 = new Counter(); // creating with default constructor
		System.out.println("Counter created with default constructor: " + counter1);
		
		IncreaseCounter increase = new IncreaseCounter(); // increase default by +1
		System.out.println("Counter increased by 1: " + increase.increaseNumber(counter1));
		
		DecreaseCounter decrease = new DecreaseCounter(); // decrease default by -1
		System.out.println("Counter decreased by 1: " + decrease.decreaseNumber(counter1));
		
		System.out.println();
		
		Counter counter2 = new Counter(45); // creating with parameterised constructor
		System.out.println("Counter created with parameterised constructor: " + counter2);
		System.out.println("Counter increased by 1: " + increase.increaseNumber(counter2));
		System.out.println("Counter decreased by 1: " + decrease.decreaseNumber(counter2));
		
		CounterCurrentState curr = new CounterCurrentState();
		
		
		System.out.println();
		curr.getState(counter1); //Class returns current state
		curr.getState(counter2);
		
		System.out.println(); //Counter increase/decrease with a custom value passed to method
		System.out.println("Counter custom increase by 10: " + increase.increaseNumber(counter1,10));
		System.out.println("Counter custom decreased by 20: " + decrease.decreaseNumber(counter1,20));
	}
}
