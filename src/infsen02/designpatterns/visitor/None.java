package infsen02.designpatterns.visitor;

/**
 * Concrete implementation of the Option interface.
 * Represents a non value.
 * 
 * @author Basit Hussain, Michelle Ritzema & Randa Bougrine
 * @param <T> The stored value's type.
 */
public class None<T> implements Option<T> {
	
	public None() { }

	/**
	 * Visits the value of the option.
	 * Uses the supplied visitor to return nothing.
	 */
	@Override
	public <U> U visit(Visitor<T, U> visitor) {
		return visitor.onNone();
	}
	
}