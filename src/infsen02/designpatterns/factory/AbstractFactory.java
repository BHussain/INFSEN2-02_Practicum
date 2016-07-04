package infsen02.designpatterns.factory;

import infsen02.enums.GUIElementType;
import infsen02.interfaces.GUIElement;


/**
 * CREATIONAL PATTERN - FACTORY
 * Creates objects without specifying the exact class to create.
 * 
 * Abstract class factory that creates GUIElement objects.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public abstract class AbstractFactory {

	/**
	 * Creates a new object.
	 * 
	 * @param type The supplied GUIElement object type.
	 * @param value The supplied value string.
	 * @return The created object.
	 */
	public abstract GUIElement create(GUIElementType type, String value);
	
}