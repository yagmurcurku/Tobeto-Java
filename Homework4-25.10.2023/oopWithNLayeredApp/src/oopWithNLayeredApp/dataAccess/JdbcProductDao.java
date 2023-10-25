package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
	//buraya sadece db erişim kodları yazılır !

	public void add(Product product) {
		System.out.println("JDBC ile veritabanına eklendi: " + product.getName());
	}
	
}