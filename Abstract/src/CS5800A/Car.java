package CS5800A;

import java.util.ArrayList;
/**
 * Abstract Factory
 */
public abstract class Car {
	String name; 
	  
	Lights lights;
	Tyres tyres;
    
    ArrayList<String> toppings = new ArrayList<String>();
    
    abstract void prepare();
    
    void paint() { 
        System.out.println("Paint the whole body"); 
    } 
    void assemble() { 
        System.out.println("Assemble the");
    } 
    void testing() { 
        System.out.println("Test all parts"); 
    } 
    public String getName() { 
        return name; 
    }
    
   
    public String toString() { 
        StringBuffer display = new StringBuffer(); 
        display.append("---- " + name + " ----\n"); 
        display.append(tyres + "\n"); 
        display.append(lights + "\n"); 
        for (int i = 0; i < toppings.size(); i++) { 
            display.append((String )toppings.get(i) + "\n"); 
        } 
        return display.toString(); 
    } 
	
	

}
