package by.htp.les08.SimpleClassesHomeTask08;

import java.util.Arrays;

public class CustomerGroup {

	private Customer [] group;
	
	public CustomerGroup() {
		this.group = new Customer [5];
	}
	
	
	public Customer [] addCustomer (Customer customer) {
		
		for(int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = customer;
				break;
			}
		}
		
		return group;
		
	}


	public Customer[] getGroup() {
		return group;
	}


	public void setGroup(Customer[] group) {
		this.group = group;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(group);
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
		CustomerGroup other = (CustomerGroup) obj;
		if (!Arrays.equals(group, other.group))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return group[0] + "\n" + group[1] + "\n" + group[2] + "\n" + group[3] + "\n" + group[4];
	}
	
	
}
