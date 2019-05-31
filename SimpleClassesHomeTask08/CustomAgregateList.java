package by.htp.les08.SimpleClassesHomeTask08;


public class CustomAgregateList {
	
	private Customer [] agrCustomer;
	
	
	public CustomAgregateList() {
		this.agrCustomer = new Customer[5];
	}
	
	
	public Customer [] searchByCreditCard (CustomerGroup group, double noLessThan, double noMoreThan) {
		
		Customer [] pullData = group.getGroup();
		

		for (int i = 0; i < pullData.length; i++) {
			double cardNo = pullData[i].getCreditCardNumber();
			if (cardNo > noLessThan && cardNo < noMoreThan) {
				
				for (int j = 0; j < this.agrCustomer.length; j++) {
					if (this.agrCustomer[j] == null) {
						this.agrCustomer[j] = pullData[i];
						break;
					}
				}
			}
		}
		
		
		return this.agrCustomer;
	}


	@Override
	public String toString() {
		return "Customers found with matching credit card details: \n"+ agrCustomer[0] + " \n"+agrCustomer[1] + " \n"+agrCustomer[2] +
				" \n"+agrCustomer[3] + " \n"+agrCustomer[4] + " \n";
	}
	
	
}
