package models;

import interfaces.Option;
import interfaces.Visitor;


/**
 * Concrete implementation of the Option interface.
 * Represents a non value.
 * 
 * @author Basit, Michelle, Randa
 *
 * @param <T> The stored value's type.
 */
public class None<T> implements Option<T> {
	
	public None() { }

	/**
	 * Uses the supplied visitor to return nothing.
	 */
	@Override
	public <U> U visit(Visitor<T, U> visitor) {
		return visitor.onNone();
	}
	
}