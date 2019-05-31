package by.htp.les08.SimpleClassesHomeTask07;

public class Demo {

	public static void main(String[] args) {
		
		Triangle triangle1 = new Triangle(100,5,5);
		System.out.println(triangle1);
		
		CalculateArea areaT = new CalculateArea();
		System.out.println("Trinagle area is: " + areaT.calculateArea(triangle1));
		CalculatePerimeter perimT = new CalculatePerimeter();
		System.out.println("Perimeter of the triangle is: " + perimT.calculatePerimeter(triangle1));
		
		Triangle triangle2 = new Triangle(7,7,7);
		System.out.println("\n"+triangle2);
		System.out.println("Triangle area is: " + areaT.calculateArea(triangle2));
		System.out.println("Perimeter of the triangle is: " + perimT.calculatePerimeter(triangle2));

		Triangle triangle3 = new Triangle(7,9,6);
		System.out.println("\n"+triangle3);
		System.out.println("Triangle area is: " + areaT.calculateArea(triangle3));
		System.out.println("Perimeter of the triangle is: " + perimT.calculatePerimeter(triangle3));
	}

}
