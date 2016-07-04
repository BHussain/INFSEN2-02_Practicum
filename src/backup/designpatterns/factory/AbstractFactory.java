package backup.designpatterns.factory;

import backup.enums.ColourType;
import backup.enums.ShapeType;
import backup.interfaces.Colour;
import backup.interfaces.Shape;


/**
 * CREATIONAL PATTERN - ABSTRACT FACTORY
 * 
 * Interface that initialises other factories.
 * This is also called a super factory.
 * @author Michelle Ritzema
 */
public abstract class AbstractFactory {

	public abstract Colour getColour(ColourType colour);
	public abstract Shape getShape(ShapeType shape);
	
}