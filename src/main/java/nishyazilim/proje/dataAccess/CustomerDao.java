package nishyazilim.proje.dataAccess;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import nishyazilim.proje.entities.Customer;
import nishyazilim.proje.entities.dtos.CustomerWithFileDto;

public interface CustomerDao extends JpaRepository<Customer,Integer>{

	Customer getByCustomerName(String customerName);
	
	@Query("Select new nishyazilim.proje.entities.dtos.CustomerWithFileDto(c.id, c.customerName, f.fileName) From File f Inner Join f.customers c")
	List<CustomerWithFileDto> getCustomerWithFileDetails();
}
