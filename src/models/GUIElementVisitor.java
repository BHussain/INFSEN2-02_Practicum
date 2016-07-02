package models;

import java.awt.Component;

import interfaces.GUIElement;
import interfaces.Visitor;


/**
 * Concrete implementation of the Visitor interface.
 * 
 * @author Basit, Michelle, Randa
 *
 */
public class GUIElementVisitor implements Visitor<GUIElement, Component> {

	/**
	 * Called when the option is a Some object.
	 * 
	 * @param value The supplied GUIElement object.
	 * @return The visited Component object.
	 */
	@Override
	public Component onSome(GUIElement value) {
		return value.getComponent();
	}

	/**
	 * Called when the option is a None object.
	 * 
	 * @return Null.
	 */
	@Override
	public Component onNone() {
		return null;
	}

}