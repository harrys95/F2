package CS5800A;

public abstract class CarStore {
	
	public Car orderCar(String type) {
		
		Car car = createCar(type);
	
		car.prepare();
		
		car.paint();
		car.assemble();
		car.testing();
		
		return car;
		
	}
	
	abstract Car createCar(String type);
	
}