package infsen02.designpatterns.decorator;

import java.awt.Color;
import java.awt.Component;

import infsen02.designpatterns.factory.ColourFactory;
import infsen02.enums.ColourType;
import infsen02.models.Button;


/**
 * Concrete class extending the ButtonDecorator.
 * Creates a button Component object with a coloured background.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public class ButtonColourDecorator extends ButtonDecorator {
	
	private Color color;

	public ButtonColourDecorator(ColourType colour, Button button) {
		ColourFactory factory = new ColourFactory();
		color = factory.create(colour);
		this.button = button;
	}

	/**
	 * Fetches the Swing component.
	 * Also supplies this object with a background color.
	 * 
	 * @return The Component object.
	 */
	@Override
	public Component getComponent() {
		Component component = button.getComponent();
		component.setBackground(color);
		return component;
	}
	
}