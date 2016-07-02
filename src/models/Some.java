package models;

import interfaces.Option;
import interfaces.Visitor;


/**
 * Concrete implementation of the Option interface.
 * Represents a value.
 * 
 * @author Basit, Michelle, Randa
 *
 * @param <T> The stored value's type.
 */
public class Some<T> implements Option<T> {

	private T value;
	
	public Some(T value) {
		this.value = value;
	}

	/**
	 * Uses the supplied visitor to return the stored value.
	 */
	@Override
	public <U> U visit(Visitor<T, U> visitor) {
		return visitor.onSome(value);
	}
	
}