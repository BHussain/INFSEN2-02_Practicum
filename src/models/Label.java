package models;

import java.awt.Component;

import javax.swing.JLabel;

import interfaces.GUIElement;

/**
 * Concrete implementation of the GUIElement interface.
 * Represents a Swing JLabel object.
 * 
 * @author Basit, Michelle, Randa
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