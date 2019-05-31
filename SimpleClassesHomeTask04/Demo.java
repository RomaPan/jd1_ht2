package by.htp.les08.SimpleClassesHomeTask04;

import java.util.Scanner;

public class Demo {


	
	public static void main(String[] args) {
		
		Train t1 = new Train("Warsaw", "67", " 9.00");
		Train t2 = new Train("Brussels", "18", " 11.00");
		Train t3 = new Train("Brussels", "11", " 19.00");
		Train t4 = new Train("Vilnius", "14", " 22.00");
		Train t5 = new Train("Amsterdam", "63", " 17.00");
		
		GroupTrain grTrain = new GroupTrain();
		
		grTrain.addToGroup(t1);
		grTrain.addToGroup(t2);
		grTrain.addToGroup(t3);
		grTrain.addToGroup(t4);
		grTrain.addToGroup(t5);
		
		System.out.println(grTrain);
		
		GroupLogic groupSort = new GroupLogic ();
		
		
		groupSort.sortByDestination(grTrain);
		System.out.println("Train table sorted by Destination and Departure Time:");
		System.out.println(grTrain); 
		
		
		System.out.println("Train table sorted by train number:");
		groupSort.sortByTrainNumber(grTrain);
		System.out.println(grTrain);
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter train number for details or <999> to Quit: ");
		String userSelectNumber = scan.next();
		scan.close();
		
		groupSort.selectTrainByNumber(grTrain, userSelectNumber);
		
		
	}

}
