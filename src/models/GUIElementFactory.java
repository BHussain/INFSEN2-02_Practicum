package models;

import enums.GUIElementTypes;
import interfaces.GUIElement;


/**
 * Class that creates different GUIElement objects.
 * What element should be created is determined by the supplied GUIElementTypes enum.
 * 
 * @author Basit, Michelle, Randa
 */
public class GUIElementFactory {

	/**
	 * Creates a new GUIElement object of a specified type.
	 * 
	 * @param type The type of GUIElement that is to be created.
	 * @param value The supplied value string.
	 * @return The created GUIElement object.
	 */
	public GUIElement create(GUIElementTypes type, String value) {
		if(type.equals(GUIElementTypes.BUTTON))
			return new Button(value);
		else if(type.equals(GUIElementTypes.LABEL))
			return new Label(value);
		return null;
	}
	
}