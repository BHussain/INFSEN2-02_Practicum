package backup.models;

import backup.interfaces.Shape;


/**
 * Concrete implementation of the Shape interface.
 * Represents a circle.
 * @author Michelle Ritzema
 */
public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
	
}