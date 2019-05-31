package by.htp.les08.SimpleClassesHomeTask03;

public class GroupLogic {
	
	private StudentLogic stLogic;
	
	public GroupLogic(StudentLogic stLogic) {
		this.stLogic = stLogic;
	}
	
	public int countALevelStudents (Group group) {
		int count = 0;
		
		Student [] students = group.getStudents();
		for (Student st : students) {
			if (stLogic.isTopMarksStudent(st)) {
				count++;
			}
		}
		return count;
		
	}
}
