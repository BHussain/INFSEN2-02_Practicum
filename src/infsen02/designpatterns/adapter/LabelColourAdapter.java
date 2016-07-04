package infsen02.designpatterns.adapter;

import java.awt.Component;

import infsen02.designpatterns.decorator.ButtonColourDecorator;
import infsen02.designpatterns.decorator.LabelDecorator;
import infsen02.models.Label;
import javax.swing.JLabel;


/**
 * STRUCTURAL PATTERN - ADAPTER
 * Allows classes with incompatible interfaces to work together by wrapping 
 * its own interface around that of an already existing class.
 * 
 * Class that creates a coloured label with the button decorator.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrines
 */
public class LabelColourAdapter extends LabelDecorator {

	private ButtonColourDecorator decorator;
	
	public LabelColourAdapter(ButtonColourDecorator decorator, Label label) {
		this.decorator = decorator;
		super.label = label;
	}

	/**
	 * Fetches the Swing component.
	 * Also supplies this object with a background color.
	 * 
	 * @return The Component object.
	 */
	@Override
	public Component getComponent() {
		Component source = decorator.getComponent();
		Component component = label.getComponent();
		component.setBackground(source.getBackground());
		((JLabel) component).setOpaque(true);
		return component;
	}
	
}