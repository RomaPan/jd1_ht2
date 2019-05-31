package by.htp.les08.SimpleClassesHomeTask07;

public class CalculateArea {

	private double area;
	
	//Heron's formula
	public double calculateArea(Triangle triangle) {

		double sA = triangle.getSideA();
		double sB = triangle.getSideB();
		double sC = triangle.getSideC();
		
		double perimentreHalf = 0.5*(sA + sB + sC);
		
		area = Math.sqrt(perimentreHalf*(perimentreHalf-sA)*(perimentreHalf-sB)*(perimentreHalf-sC));
		
		if (Double.isNaN(area) || area == 0) {
			System.out.println("Impossible triangle, unable to calculate values");
		}
		
		return area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
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
		CalculateArea other = (CalculateArea) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		return true;
	}

	
	
	
}
