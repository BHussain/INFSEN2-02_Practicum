package backup.models;

import backup.interfaces.Colour;


/**
 * Concrete implementation of the Colour interface.
 * Represents the colour green.
 * @author Michelle Ritzema
 */
public class Green implements Colour {

	public void fill() {
		System.out.println("Inside Green::fill() method.");
	}
	
}