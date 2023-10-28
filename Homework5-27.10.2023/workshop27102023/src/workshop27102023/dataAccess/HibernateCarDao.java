package workshop27102023.dataAccess;

import java.util.ArrayList;
import java.util.List;

import workshop27102023.entities.Car;

public class HibernateCarDao implements CarDao{
	
	//Car tipinde cars listesi oluşturduk. Data Access işlemlerinde bu listeyi kullanacağız.
	public List<Car> cars;
		
	public HibernateCarDao() {
		cars = new ArrayList<Car>();
	}
		

	@Override
	public void add(Car car) {
		cars.add(car);
		System.out.println(car.getBrand() + " Hibernate ile başarıyla veritabanına eklendi. ");
	}

	@Override
	public void deleteById(int id) {
		Car carX = null;
		for (Car car : cars) {
			if(id == car.getId()) {
				carX = car;
			}
		}
		cars.remove(carX);
		System.out.println("id'si " + id + " olan " + carX.getBrand() + " Hibernate ile veritabanından silindi !");
	}

	@Override
	public void update(Car car) {
		for (Car c : cars) {
			if(car.getId() == c.getId()) {
				System.out.println("Marka: " + c.getBrand() + ", Fiyat: " + c.getUnitPrice());
				c.setBrand(car.getBrand());
				c.setUnitPrice(car.getUnitPrice());
			}
		}
		System.out.println("** GÜNCELLEME BAŞARILI **");
		System.out.println("Marka: " + car.getBrand() + ", Fiyat: " + car.getUnitPrice());
	}

	@Override
	public void getById(int id) {
		for (Car car : cars) {
			if(car.getId() == id) {
				System.out.println(id + " numaralı id'ye sahip araç : " + car.getBrand());
			}
		}
	}

	@Override
	public List<Car> getAll() {
		return cars;
	}

}
