package infsen02.designpatterns.factory;

import infsen02.models.Button;


/**
 * Class that generates objects of the Button class, based on the given information.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class ButtonFactory {

	/**
	 * Creates a new Button object.
	 * 
	 * @param value The supplied value string.
	 * @return The created Button object.
	 */
	public Button create(String value) {
		return new Button(value);
	}
	
}