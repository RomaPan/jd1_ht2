package by.htp.les08.SimpleClassesHomeTask08;

public class Demo {
//	8. —оздать класс Customer, спецификаци€ которого приведена ниже. ќпределить конструкторы, set- и get-
//	методы и метод toString(). —оздать второй класс, агрегирующий массив типа Customer, с подход€щими
//	конструкторами и методами. «адать критерии выбора данных и вывести эти данные на консоль.
//	 ласс Customer: id, фамили€, им€, отчество, адрес, номер кредитной карточки, номер банковского счета.
//	Ќайти и вывести:
//	a) список покупателей в алфавитном пор€дке;
//	b) список покупателей, у которых номер кредитной карточки находитс€ в заданном интервале
	
	
	
	public static void main(String[] args) {
		
		Customer customer1 = new Customer("05", "Sviridov", "Denis", "Ivanovich", "12 Minskaya st", 111111, 220000);
		Customer customer2 = new Customer("07", "Zaycev", "Oleg", "Victorovich", "14 Minskaya st", 222222, 220001);
		Customer customer3 = new Customer("04", "Belii", "Alex", "Sergeevich", "19 Minskaya st", 333333, 220002);
		Customer customer4 = new Customer("09", "Dyatlov", "Sergei", "Petrovich", "30 Minskaya st", 444444, 220003);
		Customer customer5 = new Customer("10", "Belii", "Yura", "Pavlovich", "22 Minskaya st", 555555, 220004);
		
		CustomerGroup grCustomer = new CustomerGroup();
		
		grCustomer.addCustomer(customer1);
		grCustomer.addCustomer(customer2);
		grCustomer.addCustomer(customer3);
		grCustomer.addCustomer(customer4);
		grCustomer.addCustomer(customer5);
		
		System.out.println(grCustomer+ "\n");
		
		GroupSortLogic grLogic = new GroupSortLogic();
		grLogic.orderedBySurename(grCustomer);
		System.out.println("Sorted list of Customers by Surename & name: \n"+grCustomer+ "\n");
		
		CustomAgregateList sortByCard = new CustomAgregateList();
		
		sortByCard.searchByCreditCard(grCustomer, 222222, 555555);
		sortByCard.toString();
		System.out.println(sortByCard);
	}

}
