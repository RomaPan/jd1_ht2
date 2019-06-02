package by.htp.les08.SimpleClassesHomeTask09;

import java.util.ArrayList;
import java.util.List;

public class GroupSortLogic {

	private ArrayList<Book> sortedGroup;
	
	public GroupSortLogic() {
		this.sortedGroup = new ArrayList<Book>();
	}
	
	public List<Book> sortByAuthor(GroupBook group, String authorSort){
		
		String temp = "";
		this.sortedGroup = new ArrayList<Book>();

			for (int j = 0; j < group.getGroupBooks().size(); j++) {
				temp = group.getGroupBooks().get(j).getAuthors();
				if (temp.contains(authorSort)) {
					sortedGroup.add(group.getGroupBooks().get(j));
				}
			}
			return this.sortedGroup;	
	}
	
	
	public List<Book> sortByPublisher(GroupBook group, String publisher){
		
		String temp = "";
		this.sortedGroup = new ArrayList<Book>();

			for (int i = 0; i < group.getGroupBooks().size(); i++) {
				temp = group.getGroupBooks().get(i).getPublisher();
				if (temp.contains(publisher)) {
					sortedGroup.add(group.getGroupBooks().get(i));
				}
			}
			return this.sortedGroup;
			}
	
	public List<Book> sortByYear(GroupBook group, int year){
		
		int temp;
		this.sortedGroup = new ArrayList<Book>();

			for (int i = 0; i < group.getGroupBooks().size(); i++) {
				temp = group.getGroupBooks().get(i).getYearPublished();
				if (temp>=year) {
					sortedGroup.add(group.getGroupBooks().get(i));
				}
			}
			return this.sortedGroup;
			}

	@Override
	public String toString() {
		
		 for (int i = 0; i<sortedGroup.size(); i++) {
			System.out.println(sortedGroup.get(i));
		}
		return "";
	}
}
