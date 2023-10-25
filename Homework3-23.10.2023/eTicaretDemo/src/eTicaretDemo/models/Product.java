package eTicaretDemo.models;

public class Product {
	
	private String name;
	private int id;
	private double price;
	private int stockAmount;
	Category category;
	
	
	public Product() {
		
	}
	
	public Product(String name, int id, double price, int stockAmount, Category category) {
		this.name = name;
		this.id = id;
		this.price = price;
		this.stockAmount = stockAmount;
		this.category = category;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	

}
