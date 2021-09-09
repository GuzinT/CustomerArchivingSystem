package nishyazilim.proje.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="files")
public class File {

	@Id	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int fileId;
	
	@Column(name="file_name")
	private String fileName;
	
	public File() {}

	public File(int id, String fileName) {
		super();
		this.fileName = fileName;
	}

	public int getId() {
		return fileId;
	}

	public void setId(int id) {
		this.fileId = id;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	@OneToMany(mappedBy = "file")
	private List<Customer> customers;
	
	
}
