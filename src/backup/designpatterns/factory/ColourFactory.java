package backup.designpatterns.factory;

import backup.enums.ColourType;
import backup.enums.ShapeType;
import backup.interfaces.Colour;
import backup.interfaces.Shape;
import backup.models.Blue;
import backup.models.Green;
import backup.models.Red;


/**
 * CREATIONAL PATTERN - FACTORY
 * 
 * Design pattern that acts as a factory.
 * It generates objects of a concrete Colour class, based on the given information.
 * @author Michelle Ritzema
 */
public class ColourFactory extends AbstractFactory {

	/**
	 * Fetches an object of the type Colour.
	 * 
	 * @param shape The ColourType enum that determines which object to return.
	 * @return The created Colour object, or null if the colour type is undefined.
	 */
	public Colour getColour(ColourType colour) {
		if(colour.equals(ColourType.RED))
			return new Red();
		else if(colour.equals(ColourType.GREEN))
			return new Green();
		else if(colour.equals(ColourType.BLUE))
			return new Blue();
		return null;
	}

	/**
	 * Fetches an object of the type Shape.
	 * 
	 * @param shape The ShapeType enum that determines which object to return.
	 * @return null.
	 */
	@Override
	public Shape getShape(ShapeType shape) {
		return null;
	}
	
}