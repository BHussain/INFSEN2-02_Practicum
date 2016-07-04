package backup.models;

import backup.interfaces.Shape;


/**
 * Concrete implementation of the Shape interface.
 * Represents a square.
 * @author Michelle Ritzema
 */
public class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
	
}