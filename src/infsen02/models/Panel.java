package infsen02.models;

import java.awt.Component;

import javax.swing.JPanel;

import infsen02.interfaces.GUIElement;


/**
 * Concrete implementation of the GUIElement interface.
 * Represents a Swing JPanel object.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class Panel implements GUIElement {

	private JPanel panel;
	
	public Panel() {
		JPanel panel = new JPanel();
		this.panel = panel;
	}

	/**
	 * Fetches this GUIElement.
	 */
	@Override
	public Component getComponent() {
		return panel;
	}
	
}