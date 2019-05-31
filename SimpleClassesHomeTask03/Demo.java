package by.htp.les08.SimpleClassesHomeTask03;

public class Demo {

	public static void main(String[] args) {
		Student s1 = new Student("Ivanov", "Anatoli", 1, new int[] {7,6,8,9,10});
		Student s2 = new Student ("Petrov", "Sergei", 2, new int [] {9,9,9,9,9}); 
		Student s3 = new Student ("Sidorov", "Ivan", 3, new int [] {10,10,10,10,9});
		Student s4 = new Student ("Zaicev", "Oleg", 4, new int [] { 5,6,5,6,7});
		Student s5 = new Student ("Volkova", "Svetlana", 5, new int [] {9,9,7,9,9});
		Student s6 = new Student ("Grachev", "Petr", 6, new int [] {6,10,10,10,10});
		Student s7 = new Student ("Dubina", "Irina", 7, new int [] {8,8,7,6,5});
		Student s8 = new Student ("Svetlaya", "Angela", 8, new int [] {9,9,9,9,10});
		Student s9 = new Student ("Nikolayev", "Denis", 9, new int [] {5,6,6,3,7});
		Student s10 = new Student ("Buzova", "Olga", 10, new int [] {1,0,1,1,10});
		
		StudentLogic stLogic = new StudentLogic();
		
		Group gr1 = new Group();
		
		gr1.addStudentToGroup(s1);
		gr1.addStudentToGroup(s2);
		gr1.addStudentToGroup(s3);
		gr1.addStudentToGroup(s4);
		gr1.addStudentToGroup(s5);
		gr1.addStudentToGroup(s6);
		gr1.addStudentToGroup(s7);
		gr1.addStudentToGroup(s8);
		gr1.addStudentToGroup(s9);
		gr1.addStudentToGroup(s10);
		
		GroupLogic grLogic = new GroupLogic(stLogic);
		
		System.out.println(grLogic);
		
		System.out.println(stLogic.isTopMarksStudent(s1));
		System.out.println(stLogic.isTopMarksStudent(s2));
		System.out.println(stLogic.isTopMarksStudent(s3));
		System.out.println(stLogic.isTopMarksStudent(s4));
		System.out.println(stLogic.isTopMarksStudent(s5));
		System.out.println(stLogic.isTopMarksStudent(s6));
		System.out.println(stLogic.isTopMarksStudent(s7));
		System.out.println(stLogic.isTopMarksStudent(s8));
		System.out.println(stLogic.isTopMarksStudent(s9));
		System.out.println(stLogic.isTopMarksStudent(s10));
		
		
		System.out.println(stLogic);
		
		
	}

}
