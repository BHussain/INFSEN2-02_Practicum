package backup.models;

import backup.interfaces.Colour;


/**
 * Concrete implementation of the Colour interface.
 * Represents the colour red.
 * @author Michelle Ritzema
 */
public class Red implements Colour {

	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}
	
}