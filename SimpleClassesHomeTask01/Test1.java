package by.htp.les08.SimpleClassesHomeTask01;

public class Test1 {
	
	private int a;
	private int b;

//	1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
//	Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение
//	из этих двух переменных.
	public static void main(String[] args) {		

	}
	
	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	public void toScreen(int a, int b) {
		System.out.println("First variable: " + a + " Second variable: " + b);
	}
	
	public int largestElement (int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

}
