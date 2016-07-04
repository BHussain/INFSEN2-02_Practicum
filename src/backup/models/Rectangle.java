package backup.models;

import backup.interfaces.Shape;


/**
 * Concrete implementation of the Shape interface.
 * Represents a rectangle.
 * @author Michelle Ritzema
 */
public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
	
}