package by.htp.les08.SimpleClassesHomeTask09;

public class Demo {

	public static void main(String[] args) {
		
		Book book1 = new Book (1,"Head First Java","Kathy Sierra, Bert Bates","Oreilly", 2010, 722, 28,"Soft binding");
		Book book2 = new Book (2,"Effective Java","Joshua Bloch","Addison Wesley Professionals", 2018, 412, 43,"Soft binding");
		Book book3 = new Book (3,"Core Jave SE for Impatient","Cay Horstmann","Addison Wesley Professionals", 2017, 566, 39,"Soft binding");
		Book book4 = new Book (4,"The Game Console","Evan Amos","No Starch Press", 2018, 264, 18,"Hard binding");
		Book book5 = new Book (5,"Head Second Java","Kathy Sierra, Bert Bates","Oreilly", 2015, 500, 40,"Hard binding");
		
		GroupBook grBooks = new GroupBook();
		grBooks.addToGroup(book1);
		grBooks.addToGroup(book2);
		grBooks.addToGroup(book3);
		grBooks.addToGroup(book4);
		grBooks.addToGroup(book5);
		
		System.out.println(grBooks);
		
		GroupSortLogic grSort = new GroupSortLogic();
		
		grSort.sortByAuthor(grBooks,"Cay Horstmann");
		System.out.println("Results found for this author: ");
		System.out.println(grSort);
		
		grSort.sortByPublisher(grBooks, "Oreilly");
		System.out.println("Results found for this publisher: ");
		System.out.println(grSort);
		
		grSort.sortByYear(grBooks, 2018);
		System.out.println("Results found for books, published after given year: ");
		System.out.println(grSort);
		
		
	}

	

}
