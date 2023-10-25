package eTicaretDemo;

import eTicaretDemo.models.Category;
import eTicaretDemo.models.Order;
import eTicaretDemo.models.Product;
import eTicaretDemo.models.User;

public class Main {

	public static void main(String[] args) {
		
		Category category1 = new Category("Elektronik", 1);
		Category category2 = new Category("Ev dekorasyon", 2);
	
		
		Product product1 = new Product("Laptop", 1, 40000.44, 100, category1);
		Product product2 = new Product("Telefon", 2, 20000.22, 250, category1);
		Product product3 = new Product("Tablo", 3, 500.5, 20, category2);
		Product product4 = new Product("Vazo", 4, 350, 300, category2);
		
		
		User user1 = new User(1, "Yağmur", "Çurku", "ycurku@example.com", "05554443322");
		User user2 = new User(2, "Hasan", "Şimşek", "hsimsek@example.com", "05553332211");
		
		
		Order order1 = new Order(1, product1, user1);
		Order order2 = new Order(2, product2, user1);
		Order order3 = new Order(3, product3, user2);
		Order order4 = new Order(4, product4, user2);
		Order[] orders = {order1, order2, order3, order4};
		
		
		//1.sipariş için örnek çıktı
		System.out.println("Müşteri ad-soyad: " + order1.getUser().getFirstName() + " " + order1.getUser().getLastName());
		System.out.println("Sipariş numarası: " + order1.getId() + " numaralı sipariş.");
		System.out.println("Ürün adı: " + order1.getProduct().getName() + ", Ürünün fiyatı: " 
				+ order1.getProduct().getPrice() + ", Stok bilgisi: " + order1.getProduct().getStockAmount()
				+ ", Ürün kategorisi: " + order1.getProduct().getCategory().getCategoryName());
		System.out.println();
		
		
		//Tüm siparişlerin listelenmesi
		for (Order order : orders) {
			System.out.println(order.getId() + " numaralı sipariş : " + order.getProduct().getName()
					+ " --- Satın alan kişi iletişim numarası: " + order.getUser().getPhoneNumber());
		}
		
		
		
	}
}