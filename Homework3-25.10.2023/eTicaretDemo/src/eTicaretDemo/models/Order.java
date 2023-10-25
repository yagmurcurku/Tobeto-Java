package eTicaretDemo.models;

public class Order {

	private int id;
	Product product;
	User user;
	
	public Order() {
		
	}
	
	public Order(int id, Product product, User user) {
		this.id = id;
		this.product = product;
		this.user = user;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	
	
	
	
}
