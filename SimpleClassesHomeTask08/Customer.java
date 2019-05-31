package by.htp.les08.SimpleClassesHomeTask08;
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
public class Customer {
	
	private String id;
	private String surename;
	private String name;
	private String middleName;
	private String address;
	private double creditCardNumber;
	private double bankAccountNumber;
	
	
	public Customer (String id, String surename, String name, String middleName, 
					 String address, double creditCardNumber, double bankAccountNumber) {
		
		this.id = id;
		this.surename = surename;
		this.name = name;
		this.middleName = middleName;
		this.address = address;
		this.creditCardNumber = creditCardNumber;
		this.bankAccountNumber = bankAccountNumber;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getSurename() {
		return surename;
	}


	public void setSurename(String surename) {
		this.surename = surename;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public double getCreditCardNumber() {
		return creditCardNumber;
	}


	public void setCreditCardNumber(double creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}


	public double getBankAccountNumber() {
		return bankAccountNumber;
	}


	public void setBankAccountNumber(double bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		long temp;
		temp = Double.doubleToLongBits(bankAccountNumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(creditCardNumber);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surename == null) ? 0 : surename.hashCode());
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
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (Double.doubleToLongBits(bankAccountNumber) != Double.doubleToLongBits(other.bankAccountNumber))
			return false;
		if (Double.doubleToLongBits(creditCardNumber) != Double.doubleToLongBits(other.creditCardNumber))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surename == null) {
			if (other.surename != null)
				return false;
		} else if (!surename.equals(other.surename))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Customer [" + id + ", " + surename + ", " + name + ", " + middleName
				+ ", " + address + ", " + creditCardNumber + ", "
				+ bankAccountNumber + "]";
	}
	
	
}
