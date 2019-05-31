package by.htp.les08.SimpleClassesHomeTask01;

public class Demo {

	public static void main(String[] args) {
		
		Test1 obj = new Test1();
		
		obj.getA();
		obj.getB();
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
		obj.setA(5);
		obj.setB(7);
		
		System.out.println("Sum of two elements is "+obj.sum(obj.getA(), obj.getB()));
		
		obj.toScreen(obj.getA(), obj.getB());
		
		System.out.println("Largest element is " + obj.largestElement(obj.getA(), obj.getB()));
		
	}

}
