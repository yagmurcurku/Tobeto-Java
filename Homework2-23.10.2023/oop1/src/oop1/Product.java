package oop1;

//class'lar PascalCase.
public class Product {

	// field'lar camelCase yazılır.
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;

	// Erişim Belirleyiciler:
		// public --> her yerden erişilir
		// private --> sadece içinde old. sınıf içinden erişilir
		// protected --> aynı paketteki sınıftan ve miras alınan alt sınıflardan erişilir
		// default --> sadece aynı paketteki sınıflardan erişilir

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}
	
	/*
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	*/

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

}
