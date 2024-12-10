package kartik.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	private String id;
	private String Name;
	private String Desc;
	private int Price; 
	private int Quantity;
	private String catagory;
	
	public Product() {
		super();
	}
	public Product(String id, String name, String desc, int price, int quantity, String catagory) {
		super();
		this.id = id;
		Name = name;
		Desc = desc;
		Price = price;
		Quantity = quantity;
		this.catagory = catagory;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	
	
	

}
