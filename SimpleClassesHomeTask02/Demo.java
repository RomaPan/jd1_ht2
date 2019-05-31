package by.htp.les08.SimpleClassesHomeTask02;

public class Demo {

	public static void main(String[] args) {
		
		Test2 obj = new Test2();
		
		System.out.println(obj);
		
		obj.setA(5);
		obj.setB(10);
		
		System.out.println(obj);
		
		
		Test2 obj2 = new Test2(7,7);
		
		System.out.println(obj2);

		
		
		System.out.println(obj.toString());
		System.out.println(obj2.toString());
	}

}
