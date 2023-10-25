package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	//buraya iş kuralları (business rules) yazılır ! 
	
	private ProductDao productDao;
	private Logger[] loggers;
	//Şuan sadece interface'e bağlılık var --> Loose Coupling (LC)
	//Bir katman başka bir katmanın class'ını kullanıyorsa sadece interface üzerinden erişim kurmalıdır !
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	
	public void add(Product product) throws Exception {
		if(product.getUnitPrice()<10) {
			throw new Exception("Fiyat 10'dan küçük olamaz !");
		}
		
		//polymorphism
		//ProductDao productDao = new JdbcProductDao();
		
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}

	}
}