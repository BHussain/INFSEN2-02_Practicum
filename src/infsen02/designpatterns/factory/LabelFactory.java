package infsen02.designpatterns.factory;

import infsen02.models.Label;


/**
 * Class that generates objects of the Label class, based on the given information.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class LabelFactory {

	/**
	 * Creates a new Label object.
	 * 
	 * @param value The supplied value string.
	 * @return The created Label object.
	 */
	public Label create(String value) {
		return new Label(value);
	}
	
}