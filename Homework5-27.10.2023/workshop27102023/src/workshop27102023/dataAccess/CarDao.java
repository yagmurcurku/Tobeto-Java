package workshop27102023.dataAccess;

import java.util.List;

import workshop27102023.entities.Car;

public interface CarDao {
	
	
	void add(Car car);
	
	void deleteById(int id);
	
	void update(Car car);
	
	void getById(int id);
	
	List<Car> getAll();

}
