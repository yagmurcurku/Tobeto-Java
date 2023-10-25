package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{
	//buraya sadece db erişim kodları yazılır !
	
	public void add(Product product) {
		System.out.println("Hibernate ile veritabanına eklendi: " + product.getName());
	}

}