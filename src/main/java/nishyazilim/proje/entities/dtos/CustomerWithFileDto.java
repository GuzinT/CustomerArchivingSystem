package nishyazilim.proje.entities.dtos;

public class CustomerWithFileDto {
	private int id;
	private String customerName;
	private String fileName;

	public CustomerWithFileDto(int id, String customerName, String fileName) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.fileName = fileName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
