package infsen02.designpatterns.factory;

import infsen02.models.Panel;


/**
 * Class that generates objects of the Panel class, based on the given information.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class PanelFactory {

	/**
	 * Creates a new Panel object.
	 * 
	 * @return The created Panel object.
	 */
	public Panel create() {
		return new Panel();
	}
	
}