package interfaces;

import java.awt.*;


/**
 * Interface that represents a GUI element.
 * Contains a method to return the Swing component.
 * 
 * @author Basit, Michelle, Randa
 */
public interface GUIElement {

	/**
	 * Fetches the Swing component.
	 * 
	 * @return The Component object.
	 */
	public Component getComponent();
	
}