package CS5800A;

public class SCar extends Car{
	
	ICarFactory manufactureFactory; 
	
	public SCar(ICarFactory factory) {
		this.manufactureFactory = factory;
	}
	
	void prepare() {
		System.out.println("Assembling " + name); 
        lights = manufactureFactory.createLights(); 
        tyres = manufactureFactory.createTyres(); 
	}
}