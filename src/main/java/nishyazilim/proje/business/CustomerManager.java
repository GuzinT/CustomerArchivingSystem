package nishyazilim.proje.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;
import nishyazilim.proje.core.utilities.result.SuccessDataResult;
import nishyazilim.proje.core.utilities.result.SuccessResult;
import nishyazilim.proje.dataAccess.CustomerDao;
import nishyazilim.proje.entities.Customer;
import nishyazilim.proje.entities.dtos.CustomerWithFileDto;

@Service
public class CustomerManager implements CustomerService{
	
	private CustomerDao customerDao;

	@Autowired
	public CustomerManager(CustomerDao customerDao) {
		super();
		this.customerDao = customerDao;
	}

	@Override
	public DataResult<List<Customer>> getAll() {
		return new SuccessDataResult<List<Customer>>(this.customerDao.findAll(),"Müşteriler listelendi.");
		 
	}

	@Override
	public Result add(Customer customer) {
		this.customerDao.saveAndFlush(customer);
		return new SuccessResult("Müşteri eklendi.");
	}

	@Override
	public DataResult<Customer> getByCustomerName(String customerName) {
		return new SuccessDataResult<Customer>(this.customerDao.getByCustomerName(customerName),"Müşteri listelendi.");
	}

	@Override
	public DataResult<List<CustomerWithFileDto>> getCustomerWithFileDetails() {
		return new SuccessDataResult<List<CustomerWithFileDto>>
		(this.customerDao.getCustomerWithFileDetails(),"Data listelendi.");
	}


}
