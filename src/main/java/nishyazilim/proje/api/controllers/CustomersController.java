package nishyazilim.proje.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import nishyazilim.proje.business.CustomerService;
import nishyazilim.proje.core.utilities.result.DataResult;
import nishyazilim.proje.core.utilities.result.Result;
import nishyazilim.proje.entities.Customer;
import nishyazilim.proje.entities.dtos.CustomerWithFileDto;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

	private CustomerService customerService;
	
	@Autowired
	public CustomersController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@GetMapping("/getall")
	public DataResult<List<Customer>> getAll(){
		return this.customerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Customer customer) {
		return this.customerService.add(customer);
	}
	
	@GetMapping("/getByCustomerName")
	public DataResult<Customer> getByCustomerName(@RequestParam String customerName){
		return this.customerService.getByCustomerName(customerName);
	}
	
	@GetMapping("/getCustomerWithFileDetails")
	public DataResult<List<CustomerWithFileDto>> getCustomerWithFileDetails(){
		return this.customerService.getCustomerWithFileDetails();
	}
	
}
