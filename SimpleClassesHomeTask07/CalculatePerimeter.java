package by.htp.les08.SimpleClassesHomeTask07;

public class CalculatePerimeter {

	private double perimeter;
	
	public double calculatePerimeter(Triangle triangle) {
		
		double sA = triangle.getSideA();
		double sB = triangle.getSideB();
		double sC = triangle.getSideC();
		
		CalculateArea calcArea = new CalculateArea();
		
		//connected calculation of Perimeter to depend on calculation of Area of a triangle
		
		
		if (Double.isNaN(calcArea.calculateArea(triangle)) || calcArea.calculateArea(triangle) == 0) {
			perimeter = 0;
		} else {
			perimeter = sA + sB + sC;
		}
		
		return perimeter;
		
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(perimeter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		CalculatePerimeter other = (CalculatePerimeter) obj;
		if (Double.doubleToLongBits(perimeter) != Double.doubleToLongBits(other.perimeter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CalculatePerimeter [perimeter=" + perimeter + "]";
	}
	
	
}
