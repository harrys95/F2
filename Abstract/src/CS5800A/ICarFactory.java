package CS5800A;

/**
 * All products of the same family have the common ICARFactory interface.
 * ICARFactory is the common interface for buttons family.
 */
public interface ICarFactory {
		
		public Lights createLights(); 
		
	    public Tyres createTyres(); 
	}

