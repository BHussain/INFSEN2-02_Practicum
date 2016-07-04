package infsen02.models;

import java.awt.Component;

import javax.swing.JButton;

import infsen02.interfaces.GUIElement;


/**
 * Concrete implementation of the GUIElement interface.
 * Represents a Swing JButton object.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class Button implements GUIElement {

	private JButton button;
	
	public Button(String value) {
		JButton button = new JButton(value);
		this.button = button;
	}

	/**
	 * Fetches this GUIElement.
	 */
	@Override
	public Component getComponent() {
		return button;
	}
	
}