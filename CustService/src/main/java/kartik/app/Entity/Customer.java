package kartik.app.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	
	@Id
	private String custId;
	private String fName;
	private String lName;
	private String Email;
	private String mobile;
	private String password;
	
	public Customer() {
		super();
	}
	
	public Customer(String custId, String fName, String lName, String email, String mobile, String password) {
		super();
		this.custId = custId;
		this.fName = fName;
		this.lName = lName;
		this.Email = email;
		this.mobile = mobile;
		this.password = password;
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
