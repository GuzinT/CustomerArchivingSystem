package nishyazilim.proje.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="customers")

public class Customer {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int customerId;
	
	@Column(name="customer_name")
	private String customerName;
	
	@Column(name="customer_surname")
	private String customerSurname;
	
	//@Column(name="file_id")
	//private int fileId;
	
	public Customer() {}

	public Customer(int customerId, String customerName, String customerSurname) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSurname = customerSurname;
		//this.fileId = fileId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerSurname() {
		return customerSurname;
	}

	public void setCustomerSurname(String customerSurname) {
		this.customerSurname = customerSurname;
	}

	//public int getFileId() {
		//return fileId;
	//}

	//public void setFileId(int fileId) {
		//this.fileId = fileId;
	//}
	
	@ManyToOne()
	@JoinColumn(name="file_id")
	private File file;
	
}
