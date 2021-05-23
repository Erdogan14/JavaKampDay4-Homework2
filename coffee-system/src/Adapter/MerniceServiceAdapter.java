package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MerniceServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {


		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try 
		{
			result = proxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());		
		} 
		catch (Exception e) 
		{
			System.out.println("Not a valid person");
		}
		
		return false;
	}

}
