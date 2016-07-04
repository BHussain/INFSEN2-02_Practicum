package infsen02.designpatterns.factory;

import java.awt.Color;

import infsen02.enums.ColourType;


/**
 * Class that generates objects of the Color class, based on the given information.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class ColourFactory {

	/**
	 * Creates a new Color object.
	 * 
	 * @param colour The supplied ColourType enum that determines which object to return.
	 * @return The created Color object, or null if the colour type is undefined.
	 */
	public Color create(ColourType colour) {
		if(colour != null) {
			if(colour.equals(ColourType.RED))
				return Color.RED;
			else if(colour.equals(ColourType.GREEN))
				return Color.GREEN;
			else if(colour.equals(ColourType.BLUE))
				return Color.BLUE;
		}
		return null;
	}
	
}