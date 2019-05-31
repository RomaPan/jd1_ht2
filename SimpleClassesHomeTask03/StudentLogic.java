package by.htp.les08.SimpleClassesHomeTask03;

public class StudentLogic {
	
	public boolean isTopMarksStudent(Student student) {
		int [] progress;
		
		progress = student.getProgress();
		
		for (int mark : progress) {
			if (mark != 9 && mark != 10) {
				return false;
			} 
		} 
		return true;
	}

}
