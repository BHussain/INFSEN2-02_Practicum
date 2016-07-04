package backup.models;

import backup.interfaces.Colour;


/**
 * Concrete implementation of the Colour interface.
 * Represents the colour blue.
 * @author Michelle Ritzema
 */
public class Blue implements Colour {

	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}
	
}