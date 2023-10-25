package eTicaretDemo.models;

public class Category {

	private String categoryName;
	private int categoryId;
	
	
	public Category() {
		
	}
	
	public Category(String categoryName, int categoryId) {
		this.categoryName = categoryName;
		this.categoryId = categoryId;
	}
	
	
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
}
