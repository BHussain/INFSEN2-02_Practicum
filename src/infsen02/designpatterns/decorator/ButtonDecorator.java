package infsen02.designpatterns.decorator;

import infsen02.interfaces.GUIElement;
import infsen02.models.Button;


/**
 * STRUCTURAL PATTERN - DECORATOR
 * Dynamically adds/overrides behaviour in an existing method of an object.
 * 
 * The abstract class that represents a button decorator.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 */
public abstract class ButtonDecorator implements GUIElement {

	protected Button button;
	
}