package by.htp.les08.SimpleClassesHomeTask08;

public class GroupSortLogic {

	
	public void orderedBySurename (CustomerGroup groupToSort) {
		Customer temp;
		
		Customer [] sortCustomer = groupToSort.getGroup();
		for (int i = 0; i < sortCustomer.length-1; i++) {
			for (int j = i+1; j < sortCustomer.length; j++) {
				
				String a = sortCustomer[i].getSurename();
				String b = sortCustomer[j].getSurename();
				String c = sortCustomer[i].getName();
				String d = sortCustomer[j].getName();
				
				if (a.compareTo(b)>0) {
					temp = sortCustomer[i];
					sortCustomer[i]=sortCustomer[j];
					sortCustomer[j]=temp;
					
				}
				if (a == b && c.compareTo(d)>0) {
						temp = sortCustomer[i];
						sortCustomer[i]=sortCustomer[j];
						sortCustomer[j]=temp;
						
					
				}
			}
		}
	}
	
	
}
