import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"Eroğan","Çiftçi", LocalDate.of(2001, 06, 14), "10259100390"));

	}

}
