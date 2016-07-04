package infsen02.models;

import java.awt.Component;

import javax.swing.JLabel;

import infsen02.interfaces.GUIElement;

/**
 * Concrete implementation of the GUIElement interface.
 * Represents a Swing JLabel object.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class Label implements GUIElement {

	private JLabel label;
	
	public Label(String value) {
		JLabel label = new JLabel(value);
		this.label = label;
	}

	/**
	 * Fetches this GUIElement.
	 */
	@Override
	public Component getComponent() {
		return label;
	}
	
}