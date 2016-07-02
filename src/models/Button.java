package models;

import java.awt.Component;

import javax.swing.JButton;

import interfaces.GUIElement;


/**
 * Concrete implementation of the GUIElement interface.
 * Represents a Swing JButton object.
 * 
 * @author Basit, Michelle, Randa
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