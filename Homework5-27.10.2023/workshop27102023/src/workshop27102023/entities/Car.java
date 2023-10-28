package workshop27102023.entities;

public class Car {

	private int id;
	private String brand;
	private double unitPrice;

	
	public Car() {

	}

	public Car(int id, String name, double unitPrice) {
		this.id = id;
		this.brand = name;
		this.unitPrice = unitPrice;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
