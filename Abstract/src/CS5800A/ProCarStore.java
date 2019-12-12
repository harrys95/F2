package CS5800A;

public class ProCarStore extends CarStore{

		@Override
		Car createCar(String type) {
			Car car = null; 
	     
			ICarFactory icartFactory = 
	            new BossCarFactory(); 
	        
	        if (type.equals("MSC")) { 
	        
	        	car = new SCar(icartFactory); 
	            car.name = "M Style Car";
	            
	        } else if (type.equals("Boost")) { 
	           
	        } else if (type.equals("Space")) { 
	            
	        } else if (type.equals("Base")) {
	           
	        } 
	        return car; 
		}

	}


