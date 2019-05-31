package by.htp.les08.SimpleClassesHomeTask03;

import java.util.Arrays;

//3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость 
//(массив из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность 
// вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.


public class Student {
	
	private String surname;
	private String name;
	private int groupNumber;
	private int [] progress;
	
	public Student(String surname, String name, int groupNumber, int [] progress) {
		this.surname = surname;
		this.name = name;
		this.groupNumber = groupNumber;
		this.progress = progress;
		
	}

	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getGroupNumber() {
		return groupNumber;
	}



	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}



	public int[] getProgress() {
		return progress;
	}



	public void setProgress(int[] progress) {
		this.progress = progress;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Arrays.hashCode(progress);
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
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
		Student other = (Student) obj;
		if (groupNumber != other.groupNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (!Arrays.equals(progress, other.progress))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Student [Surname = " + surname + ", Name = " + name + ", Group = " + groupNumber + ", progress = "
				+ Arrays.toString(progress) + "]";
	}

	
}
