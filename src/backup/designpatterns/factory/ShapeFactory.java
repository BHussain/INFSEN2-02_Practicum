package backup.designpatterns.factory;

import backup.enums.ColourType;
import backup.enums.ShapeType;
import backup.interfaces.Colour;
import backup.interfaces.Shape;
import backup.models.Circle;
import backup.models.Rectangle;
import backup.models.Square;


/**
 * CREATIONAL PATTERN - FACTORY
 * 
 * Design pattern that acts as a factory.
 * It generates objects of a concrete Shape class, based on the given information.
 * @author Michelle Ritzema
 */
public class ShapeFactory extends AbstractFactory {

	/**
	 * Fetches an object of the type Shape.
	 * 
	 * @param shape The ShapeType enum that determines which object to return.
	 * @return The created Shape object, or null if the shape type is undefined.
	 */
	@Override
	public Shape getShape(ShapeType shape) {
		if(shape.equals(ShapeType.CIRCLE))
			return new Circle();
		else if(shape.equals(ShapeType.RECTANGLE))
			return new Rectangle();
		else if(shape.equals(ShapeType.SQUARE))
			return new Square();
		return null;
	}

	/**
	 * Fetches an object of the type Colour.
	 * 
	 * @param shape The ColourType enum that determines which object to return.
	 * @return null.
	 */
	@Override
	public Colour getColour(ColourType colour) {
		return null;
	}
	
}