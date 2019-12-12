package CS5800A;

public class Test {
	
		public static void main(String[] args) {
			CarStore carStore = new ProCarStore();
			Car car = carStore.orderCar("MSC");
			car.lights.display();
			car.tyres.display();
			System.out.println("READY FOR RIDE");
		}
	}

