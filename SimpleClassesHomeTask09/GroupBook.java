package by.htp.les08.SimpleClassesHomeTask09;

import java.util.ArrayList;
import java.util.List;

public class GroupBook {

	private ArrayList<Book> groupBooks;
	
	
	public GroupBook () {
		this.groupBooks = new ArrayList<Book>();
	}
	
	public  List<Book> addToGroup(Book book){
		
		groupBooks.add(book);
		
		return this.groupBooks;
	}

	public ArrayList<Book> getGroupBooks() {
		return groupBooks;
	}

	public void setGroupBooks(ArrayList<Book> groupBooks) {
		this.groupBooks = groupBooks;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((groupBooks == null) ? 0 : groupBooks.hashCode());
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
		GroupBook other = (GroupBook) obj;
		if (groupBooks == null) {
			if (other.groupBooks != null)
				return false;
		} else if (!groupBooks.equals(other.groupBooks))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return groupBooks.get(0)+"\n" + groupBooks.get(1)+"\n" + groupBooks.get(2)+
				"\n" + groupBooks.get(3)+"\n" + groupBooks.get(4)+"\n";
	}
	
	
	
}
