package by.htp.les08.SimpleClassesHomeTask02;

public class Test2 {
	private int a;
	private int b;
	
	Test2 (int a, int b){
		this.a = a;
		this.b = b;
	}
	Test2 (){
		
	}
	
	
//	2. ������� ����� Test2 ����� �����������. �������� ����������� � �������� �����������. �������� 
//	�����������, ���������������� ����� ������ �� ���������. �������� set- � get- ������ ��� ����� 
//	���������� ������.
	public static void main(String[] args) {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
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
		Test2 other = (Test2) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
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
	@Override
	public String toString() {
		return "Test2 [a=" + a + ", b=" + b + "]";
	}
	
	
	
	
}
