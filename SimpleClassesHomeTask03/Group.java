package by.htp.les08.SimpleClassesHomeTask03;

import java.util.Arrays;

public class Group {
	
	private Student [] students;
	
	public Group (){
		students = new Student [10];
	}
	
	public void addStudentToGroup (Student newStudent) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = newStudent;
				break;
			}
		}
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(students);
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
		Group other = (Group) obj;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Group [students=" + Arrays.toString(students) + "]";
	}
	
	
	
}
