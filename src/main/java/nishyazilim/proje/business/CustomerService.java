package nishyazilim.proje.business;

import java.util.List;

import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;
import nishyazilim.proje.entities.Customer;
import nishyazilim.proje.entities.dtos.CustomerWithFileDto;

public interface CustomerService {
	
	DataResult<List<Customer>> getAll(); //tüm customerları getirir
	Result add(Customer customer);
	
	DataResult<Customer> getByCustomerName(String customerName);
	
	DataResult<List<CustomerWithFileDto>> getCustomerWithFileDetails();
}
